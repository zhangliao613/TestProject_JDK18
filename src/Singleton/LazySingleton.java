package Singleton;

public class LazySingleton {
	private static LazySingleton m_instance = null;

	private LazySingleton() {
	}

	synchronized public static LazySingleton getInstance() {
		if (m_instance == null) {
			System.out.println("===m_instance===null===");
			m_instance = new LazySingleton();
		}else
		{
			System.out.println("===m_instance===not null===");
		}
		return m_instance;
	}
	
	public static void main (String []args)
	{
		LazySingleton lazySingleton = LazySingleton.getInstance();  
		  LazySingleton lazySingleton1 = LazySingleton.getInstance();
		  
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
