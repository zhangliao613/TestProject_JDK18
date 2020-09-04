package lock.aqs;
import java.util.HashMap;  
import java.util.Map;  
import java.util.concurrent.locks.ReadWriteLock;  
import java.util.concurrent.locks.ReentrantReadWriteLock;  

public class CacheDemo {  

    //定义一个map用于缓存对象  
    private Map<String, Object> cache = new HashMap<String, Object>();  

    //获取一个读写锁对象  
    private ReadWriteLock rwl = new ReentrantReadWriteLock();  

    //带有缓存的获取指定值的方法  
    public  Object getData(String key){  
        rwl.readLock().lock();      //上读锁  
        Object value = null;  
        try{  
            value = cache.get(key); //获取要查询的值     
            if(value == null){  //线程出现安全问题的地方  

                rwl.readLock().unlock();    //没有数据，释放读锁，上写锁
                // 多个线程去上写锁，第一个上成功后，其他线程阻塞，第一个线程开始执行下面的代码，最后
                // 释放写锁后，后面的线程继续上写锁，为了避免后面的线程重复写入，进行二次判断
                rwl.writeLock().lock();
                try{  
                    if(value==null){    //二次判断，防止其他线程重复写数据  
                            value = "aaaa"; //实际是去查询数据库  
                    }  
                }finally{  
                    rwl.writeLock().unlock();   //写完数据，释放写锁  
                }  
                rwl.readLock().lock();  //恢复读锁  
            }  
        }finally{  
            rwl.readLock().unlock();    //最终释放读锁  
        }  
        return value;   //返回获取到的值  
    }  
}
