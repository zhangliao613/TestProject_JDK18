package thread;
public class ThreadDemo9_4 {
	public static void main(String args[]) {
		
		TestThread4 t = new TestThread4();
//		t.start();
//		t.start();//执行报错,Thread is already started
		// 启动了四个线程，分别执行各自的操作
		/**/
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		
	}
}

class TestThread4 implements Runnable {
	private int tickets = 20;

	public void run() {
		while (true) {
			if (tickets > 0)

				System.out.println(Thread.currentThread().getName() + "出售票"
						+ tickets--);
			else
				break;
		}
	}
}