package Singleton;

public class HolderSingleton {

	private HolderSingleton() {
	}

	/**
	 * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
	 */
	private static class SingletonHolder {
		/**
		 * 静态初始化器，由JVM来保证线程安全
		 */
		private static HolderSingleton instance = new HolderSingleton();
	}

	public static HolderSingleton getInstance() {
		return SingletonHolder.instance;
	}

	public static void main(String[] args) {
		HolderSingleton lazySingleton = HolderSingleton.getInstance();
		HolderSingleton lazySingleton1 = HolderSingleton.getInstance();

		if (lazySingleton == lazySingleton1) {
			System.out.println("同一个对象实例");
		} else {
			System.out.println("不是同一个对象实例");
		}
		// String a = "a";
		// String b = new String("a");
		// if(a==b){
		// System.out.println("同一个对象实例1");
		// }else{
		// System.out.println("不是同一个对象实例1");
		// }

	}
}
