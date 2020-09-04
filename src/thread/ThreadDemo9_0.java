package thread;
public class ThreadDemo9_0 {
	public static void main(String args[]) {
		new TestThread0().run();
		// 循环输出
		for (int i = 0; i < 10; i++)
		{
			System.out.println("main 线程在运行");
		}
	}
}

class TestThread0
{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("TestThread 在运行");
		}
	}
}