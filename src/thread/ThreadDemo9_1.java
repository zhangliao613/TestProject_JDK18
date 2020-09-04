package thread;
public class ThreadDemo9_1 {
	public static void main(String args[]) {
		//TestThread t = new TestThread();
		//System.out.println("===Thread.interrupted()0==="+t.isAlive());
		// 调用Thread类中的start()方法，实际上是调用run()方法
		new TestThread().start();
		//System.out.println("===Thread.interrupted()1==="+t.isAlive());
		// 循环输出
		for (int i = 0; i < 10; i++)
		{
			System.out.println("main 线程在运行");
		}
	}
}

class TestThread extends Thread
// TestThread类继承了Thread类，此类实现了多线程
{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("TestThread "+this.getName()+"在运行");
		}
	}
}