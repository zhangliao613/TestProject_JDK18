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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

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


public class ArrayBlockingQueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayBlockingQueueTest test = new ArrayBlockingQueueTest();
		
		test.LinkedBlockQueue();
//		int h=0;
//		int length=1;
//		int x = (h & (length-1));
//		System.out.println(x);
	}
	public void LinkedBlockQueue(){
		
		ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(10);
		arrayBlockingQueue.add("");
	}
}
