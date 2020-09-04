package thread.notsync;

class CubbyHole {
	private int content;

	public synchronized void put(int value) {
		content = value;
	}

	public synchronized int get() {
		return content;
	}
}