package lock.aqs;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;

class MyFairLock{

	private Thread ownerThread;

	private volatile AtomicInteger state;

	private boolean isFair;


	private volatile Node head;

	static class Node{

		private volatile Node pre;

		private volatile Node next;

		private volatile Thread thread;


		public Node(Thread thread){
			this.thread = thread;
		}

		@Override
		public String toString() {
			return "Node{" +
					", thread=" + thread==null?"null":thread.getName() +
					'}';
		}
	}

	public MyFairLock(boolean isFair){
		state = new AtomicInteger(0);
		head = new Node(null);
		this.isFair = isFair;
	}

	public Thread getOwnerThread() {
		return ownerThread;
	}

	public void setOwnerThread(Thread ownerThread) {
		this.ownerThread = ownerThread;
	}

	public boolean lock(){
		//可重入
		for (;;) {
			if (Thread.currentThread() == getOwnerThread()){
				state.incrementAndGet();
				return true;
			}else if(state.compareAndSet(0,1)) {
				System.out.println(Thread.currentThread());
				setOwnerThread(Thread.currentThread());
				return true;
			}
			if (isFair){
				Node temp = head;
					while(temp.next !=null){
						temp = temp.next ;
					}

					//将阻塞的线程放入链表的队尾。
					temp.next = new Node(Thread.currentThread());
					temp.next.pre = temp;
			       LockSupport.park();
			}
		}
	}
	
	public void unlock(){
		if (Thread.currentThread() != getOwnerThread()){
			throw new RuntimeException("不是锁持有线程，不能解锁");
		}
		setOwnerThread(null);
		state.decrementAndGet();
		if(isFair){
			Node temp = head;
			Node unlockNode = head.next;
			if (unlockNode!=null&&unlockNode.thread!=null){
				LockSupport.unpark(unlockNode.thread);
				temp.next = unlockNode.next;
				if(unlockNode.next!=null){
					unlockNode.next.pre = temp;
				}
			}
			Node temp1 = head;
			while (temp1!=null){
				System.out.println("unlock"+temp1.thread);
				temp1 = temp1.next;
			}

		}
	}
}
 
