package Singleton;

public class EagerSingleton {
	private static final EagerSingleton m_instance = new EagerSingleton();

	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return m_instance;
	}
	public static void main (String []args)
	{
		EagerSingleton eagerSingleton = EagerSingleton.getInstance();  
		EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
		  
		  if(eagerSingleton==eagerSingleton1){
		   System.out.println("同一个对象实例");
		  }else{
		   System.out.println("不是同一个对象实例");
		  }

	}
}
