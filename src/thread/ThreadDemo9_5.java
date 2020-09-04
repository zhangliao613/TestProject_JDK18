package thread;

public class ThreadDemo9_5 {
	public static void main(String[] args) {
		TestThread5 t = new TestThread5();
		// 启动了四个线程，实现了资源共享的目的
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}

class TestThread5 implements Runnable {
	private int tickets = 20;

	public void run() {
		while (true) {
			synchronized(this) //注释掉这行会出现负数
			{
				if (tickets > 0) {
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
					System.out.println(Thread.currentThread().getName() + "出售票"
							+ tickets--);
				}
			}
		}
	}
}