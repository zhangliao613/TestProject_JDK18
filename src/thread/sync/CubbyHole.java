package thread.sync;

class CubbyHole {
	private int content;
	private boolean available = false;

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		content = value;
		available = true;
		notifyAll();
	}

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return content;
	}
}
