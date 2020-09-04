package lock.aqs;

import java.util.concurrent.atomic.AtomicInteger;

class MyLock{

	private Thread ownerThread;

	private volatile AtomicInteger state;


	public MyLock(){
		state = new AtomicInteger(0);
	}

	public Thread getOwnerThread() {
		return ownerThread;
	}

	public void setOwnerThread(Thread ownerThread) {
		this.ownerThread = ownerThread;
	}

	public boolean lock(){
		//可重入
		String ownerThread = "";
		if(getOwnerThread()!=null){
			ownerThread = getOwnerThread().getName();
		}
		System.out.println("===currentThread000==="+Thread.currentThread().getName()+"===OwnerThread==="+ownerThread+"===state==="+state);
		for (;;) {
			if (Thread.currentThread() == getOwnerThread()){
				state.incrementAndGet();
				System.out.println("===currentThread==="+Thread.currentThread().getName()+"===OwnerThread==="+ownerThread+"===state==="+state);
				return true;
			}else if(state.compareAndSet(0,1)){
				System.out.println("===currentThread2222==="+Thread.currentThread().getName()+"===OwnerThread==="+ownerThread+"===state==="+state);
				setOwnerThread(Thread.currentThread());
			}
		}
		
	}

	public void unlock(){
		if (Thread.currentThread() != getOwnerThread()){
			throw new RuntimeException("不是锁持有线程，不能解锁");
		}
		setOwnerThread(null);
		state.decrementAndGet();
	}
	
	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				TestUtil.testSout();
			}
		};
		Thread thread = new Thread(runnable, "0");
		Thread thread1 = new Thread(runnable, "1");
		Thread thread2 = new Thread(runnable, "2");
		Thread thread3 = new Thread(runnable, "3");
		
		thread.start();
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread.join();
		thread1.join();
		thread2.join();
		thread3.join();
	}
	
}
 
