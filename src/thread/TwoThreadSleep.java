package thread;
public class TwoThreadSleep extends Thread {
	public void run() {
		loop();
	}

	public void loop() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " ---->> 刚进入loop方法");
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException x) {
			}
			System.out.println("name=" + name);
		}
		System.out.println(name + " ---->> 离开loop方法");
	}

	public static void main(String[] args) {
		TwoThreadSleep tt = new TwoThreadSleep();
		tt.setName("my worker thread");
		tt.start();
		try {
			Thread.sleep(700);
		} catch (InterruptedException x) {
		}
		tt.loop();
	}
}