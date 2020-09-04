package thread;



/** 

* 

* @author ydj 

* 

*/ 

public class SynTest2 { 



    public static void main(String[] args){ 

       Callme target=new Callme(); 

       Caller ob1=new Caller(target,"Hello"); 

       Caller ob2=new Caller(target,"Synchronized"); 

       Caller ob3=new Caller(target,"World"); 

    } 

} 



class Callme{ 

    

    /** 

     * 有和没有synchronized的时候，结果是不一样的 

     */ 

    synchronized void test(){ 

       LogUtil.log("测试是否是：一旦一个线程进入一个实例的任何同步方法，别的线程将不能进入该同一实例的其它同步方法，但是该实例的非同步方法仍然能够被调用"); 

    } 

    

    void nonsynCall(String msg){ 

       LogUtil.log("["+msg); 

       LogUtil.log("]"); 

    } 

    

    synchronized void synCall(String msg){ 

       LogUtil.logPrint("["+msg); 

       LogUtil.log("]"); 

    } 

} 



class Caller implements Runnable{ 

    String msg; 

    Callme target; 

    Thread t; 

    

    Caller(Callme target,String msg){ 

       this.target=target; 

       this.msg=msg; 

       t=new Thread(this); 

       t.start(); 

    } 

    

    public void run() { 

       // TODO Auto-generated method stub 

       //target.nonsynCall(msg); 

       target.synCall(msg); 

       target.test(); 

    } 

    

}

