package Singleton;

public class TestSingleton {

	private static TestSingleton m_instance = null;
	public static TestSingleton getInstance() {
		if (m_instance == null) {
			System.out.println("===m_instance===null===");
			m_instance = new TestSingleton();
		}else
		{
			System.out.println("===m_instance===not null===");
		}
		return m_instance;
	}
	
	public static void main (String []args)
	{
		TestSingleton lazySingleton = TestSingleton.getInstance();  
		TestSingleton lazySingleton1 = TestSingleton.getInstance();
		  
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
