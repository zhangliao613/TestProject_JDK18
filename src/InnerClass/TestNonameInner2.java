package InnerClass;

interface A1 {
	public void fun1();
}

class B1 {
	int i = 10;

	public void get(A1 a) {
		a.fun1();
	}

	public void test() {
		this.get(new A1() {
			public void fun1() {
				System.out.println(i);
			}
		});
	}
}

class TestNonameInner2 {
	public static void main(String[] args) {
		B1 b = new B1();
		b.test();
	}
}