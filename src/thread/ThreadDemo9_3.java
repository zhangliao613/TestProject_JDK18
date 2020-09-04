package thread;
public class ThreadDemo9_3 {
	public static void main(String args[]) {
//		System.out.println(Thread.currentThread().getName() + "出售票");
		TestThread3 t = new TestThread3("0");
//		t.start();
//		t.start();//执行报错,Thread is already started
		// 启动了四个线程，分别执行各自的操作
		/**/
		new TestThread3("1").start();
		new TestThread3("2").start();
//		new TestThread3().start();
//		new TestThread3().start();
//		new TestThread3("1").run();
//		new TestThread3("2").run();
		System.out.println("main over");
	}
}

class TestThread3 extends Thread {
	public TestThread3(){
		super();
	}
	public TestThread3(String name){
		super(name);
	}
	private int tickets = 5;

	public void run() {
		
		while (true) {
			if (tickets > 0)

				System.out.println(Thread.currentThread().getName() + "出售票"
						+ tickets--);
			else
				break;
		}
		
		/*
		for (int i = 0; i < tickets; i++) {
			if (tickets > 0)
				System.out.println(Thread.currentThread().getName() + "出售票"
						+ tickets--);
		}
		*/
	}
}