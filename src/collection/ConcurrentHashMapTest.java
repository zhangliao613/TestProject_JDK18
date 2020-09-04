package collection;


import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class ConcurrentHashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConcurrentHashMapTest test = new ConcurrentHashMapTest();
		
		test.concurrentHashMap();
        int sshift = 0;
        int ssize = 1;
        while (ssize < 16) {
            ++sshift;
            ssize <<= 1;
        }
        int segmentShift = 32 - sshift;
        int segmentMask = ssize - 1;
        int initialCapacity = 16;
        int c = initialCapacity / ssize;
        if (c * ssize < initialCapacity)
            ++c;
        int cap = 2;
        while (cap < c)
            cap <<= 1;
//        System.out.println("===ssize==="+ssize+"===sshift==="+sshift+"==segmentShift==="+segmentShift+"==segmentMask==="+segmentMask+"==c==="+c+"==cap==="+cap);
	}
	public void concurrentHashMap(){
		ConcurrentHashMap<String,String> bodyMap = new ConcurrentHashMap<String,String>();
		bodyMap.put("1", "1");
		bodyMap.put("2", "2");
		bodyMap.put("3", "3");
//		bodyMap.put(null, null);
		bodyMap.put("4", "4");
//		bodyMap.entrySet();
//		bodyMap.keySet()
		for (String key : bodyMap.keySet()) {
			System.out.println(key+ ":" + bodyMap.get(key));
		}
//		Enumeration a = new Enumeration();
//		for (String value : bodyMap.values()) {
//			System.out.println(value);
//		}
		
		for (Map.Entry<String, String> entry : bodyMap.entrySet()) {
//			System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
		
		Iterator<Map.Entry<String, String>> it = bodyMap.entrySet().iterator();
	    while (it.hasNext()) {
	      Map.Entry<String, String> entry = it.next();
	      System.out.println(entry.getKey() + ":" + entry.getValue());
	      // it.remove(); 删除元素
	    }
	    
	}
}
