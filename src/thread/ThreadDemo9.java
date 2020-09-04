package thread;
public class ThreadDemo9 {
	public static void main(String args[]) {
		// 循环输出
		for (int i = 0; i < 10; i++)
		{
			//new TestThread1().run();
			new TestThread1().run();
			//System.out.println("main 线程在运行"+tickets);
		}
	}
}

class TestThread1 extends Thread
{
	public void run() {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("TestThread 在运行");
//		}
		int tickets = 0;
		tickets ++;
		System.out.println("==="+tickets);
	}
}