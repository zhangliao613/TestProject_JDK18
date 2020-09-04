package lock.aqs;

class TestUtil{

	
	public static void testSout(){
		MyLock lock = new MyLock();
		try{
			boolean a = lock.lock();
			System.out.println("a"+a);
			Thread.sleep(100);
			System.out.println("b");
			Thread.sleep(100);
			System.out.println("c");
			Thread.sleep(100);
			System.out.println("d");
			Thread.sleep(100);
		}catch (Exception e){
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

	
}
 
