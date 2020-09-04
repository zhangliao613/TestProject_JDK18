package thread;
public class ThreadJoin {
	public static void main(String[] args) {
		ThreadTest1 t = new ThreadTest1();
		Thread pp = new Thread(t);
		pp.start();
		int i = 0;
		for (int x = 0; x < 10; x++) {
			if (i == 5) {
				try {
					pp.join(); // 强制运行完一线程后，再运行后面的线程
				} catch (Exception e) // 会抛出InterruptedException
				{
					System.out.println(e.getMessage());
				}
			}
			System.out.println("main Thread " + i++);
		}
	}
}

class ThreadTest1 implements Runnable {
	public void run() {
		String str = new String();
		int i = 0;
		for (int x = 0; x < 10; x++) {
			System.out.println(Thread.currentThread().getName() + " ---->> "
					+ i++);
		}
	}
}