package collection;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMapTest test = new HashMapTest();
		
		test.hashMap();
//		int h=0;
//		int length=1;
//		int x = (h & (length-1));
//		System.out.println(x);
	}
	public void hashMap(){
		HashSet<String> bodyMap = new HashSet<String>();
		bodyMap.add("1");
		bodyMap.add("2");
		bodyMap.add("3");
		bodyMap.add("4");
		bodyMap.add("5");
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
//	      System.out.println(entry.getKey() + ":" + entry.getValue());
	      // it.remove(); 删除元素
	    }
	    
	}
}
