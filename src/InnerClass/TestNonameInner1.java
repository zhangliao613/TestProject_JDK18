package InnerClass;

interface A {
	public void fun1();
}

class B {
	int i = 10;

	class C implements A {
		public void fun1() {
			System.out.println(i);
		}
	}

	public void get(A a) {
		a.fun1();
	}

	public void test() {
		this.get(new C());
	}
}

class TestNonameInner1 {
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}
}