package design.proxy.stat;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		AInterface impl = new AInterfaceImpl();
		AProxy proxy = new AProxy(impl);
		proxy.ProxySay();
	}

}
