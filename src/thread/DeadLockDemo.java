package thread;

class A {
	synchronized void funA(B b) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 进入 A.foo ");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(name + " 调用 B类中的last()方法");
		b.last();
	}

	synchronized void last() {
		System.out.println("A类中的last()方法");
	}
}

class B {
	synchronized void funB(A a) {
		String name = Thread.currentThread().getName();
		System.out.println(name + " 进入 B 类中的");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(name + " 调用 A类中的last()方法");
		a.last();
	}

	synchronized void last() {
		System.out.println("B类中的last()方法");
	}
}

class DeadLockDemo implements Runnable {
	A a = new A();
	B b = new B();

	DeadLockDemo() {
		// 设置当前线程的名称
		Thread.currentThread().setName("Main -->> Thread");
		new Thread(this).start();
		a.funA(b);
		System.out.println("main线程运行完毕");
	}

	public void run() {
		Thread.currentThread().setName("Test -->> Thread");
		b.funB(a);
		System.out.println("其他线程运行完毕");
	}

	public static void main(String[] args) {
		new DeadLockDemo();
	}
}