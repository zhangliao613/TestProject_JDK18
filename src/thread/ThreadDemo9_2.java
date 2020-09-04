package thread;
public class ThreadDemo9_2 {
	public static void main(String args[]) {
		System.out.println("===Thread.activeCount()0==="+Thread.activeCount());
		System.out.println("===Thread.interrupted()0==="+Thread.interrupted());
		TestThread2 t = new TestThread2();
		// 产生Runnable接口的子类实例化对象
		// 通过Thread类的start()方法，启动多线程序
		new Thread(t).start();
		// 循环输出
		for (int i = 0; i < 10; i++)
		{
			System.out.println("main 线程在运行");
		}
		/*
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
		System.out.println("===Thread.activeCount()==="+Thread.activeCount());
		System.out.println("===Thread.interrupted()==="+Thread.interrupted());
		System.out.println("===Thread.isAlive()==="+new Thread(t).isAlive());

		
	}
}

class TestThread2 implements Runnable
// TestThread通过实现Runnable接口，实现多线程
{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("TestThread 在运行");
		}
	}
}