package Singleton;

public class DoubleCheckSingleton {
	private volatile static DoubleCheckSingleton m_instance = null;

	private DoubleCheckSingleton() {
	}

	public static DoubleCheckSingleton getInstance() {
		//先检查实例是否存在，如果不存在才进入下面的同步块
        if(m_instance == null){
    		//同步块，线程安全的创建实例
            synchronized (DoubleCheckSingleton.class) {
            	//再次检查实例是否存在，如果不存在才真正的创建实例
                if(m_instance == null){
                	m_instance = new DoubleCheckSingleton();
                }
            }
        }
        return m_instance;
	}
	
	public static void main (String []args)
	{
		DoubleCheckSingleton lazySingleton = DoubleCheckSingleton.getInstance();  
		DoubleCheckSingleton lazySingleton1 = DoubleCheckSingleton.getInstance();
		  
		  if(lazySingleton==lazySingleton1){
		   System.out.println("同一个对象实例");
		  }else{
		   System.out.println("不是同一个对象实例");
		  }
//		  String a = "a";
//		  String b = new String("a");
//		  if(a==b){
//			   System.out.println("同一个对象实例1");
//			  }else{
//			   System.out.println("不是同一个对象实例1");
//			  }

	}
}
