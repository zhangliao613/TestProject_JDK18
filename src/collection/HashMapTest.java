package collection;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;

import net.sf.json.JSONArray;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

//import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;


public class HashMapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashMapTest test = new HashMapTest();
		
		test.hashMap();
		int MAXIMUM_CAPACITY = 1 << 30;
		int number = 16;
		int result=number >= MAXIMUM_CAPACITY? MAXIMUM_CAPACITY: (number > 1) ? Integer.highestOneBit((number - 1) << 1) : 1;
        System.out.println("result==="+result);            
                
//		int h=0;
//		int length=1;
//		int x = (h & (length-1));
//		System.out.println(x);
	}
	public void hashMap(){
		HashMap<String,String> bodyMap = new HashMap<String,String>();
		String a = bodyMap.put("1", "1");
		bodyMap.put("2", "2");
		bodyMap.put("3", "3");
		bodyMap.put(null, "0");
		bodyMap.put("4", "4");
//		bodyMap.put(null, "00");
		System.out.println(bodyMap.size()+"==="+bodyMap.values());
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
