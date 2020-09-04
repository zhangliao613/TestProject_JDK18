import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
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

import net.sf.json.JSONArray;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;

import com.alibaba.fastjson.JSONObject;



public class MainJava {

	/**
	 * @param args
	 */
	private static final int DEF_DIV_SCALE = 10; //这个类不能实例化
	public static void main(String[] args) {
		MainJava mainJava = new MainJava();
		
//		String activityIds = "111,112,113,114";
//		String activityIds = "2,12,13,14";
//		String id="113";
//		for (int i = 0; i < 10; i++) {
//			
//			if(activityIds!=null && !"".equals(activityIds)) {
//				String [] activityIdsArr = activityIds.split(",");
//				System.out.println("==="+i+"==="+i);
//				
//				if(activityIdsArr!=null && activityIdsArr.length>0) {
//					for (int j = 0; j < activityIdsArr.length; j++) {
////						System.out.println("===activityIdsArr==="+i+"==="+j+"==="+activityIdsArr[j]);
//						if (activityIdsArr[j].equals(i+"")) {
//							System.out.println("==="+i+"==="+j+"===contains===");
//							break;
//						} 
//						else {
//							System.out.println("==="+i+"==="+j+"===not contains===");
//						}
//					}
//				}
//			}
////			System.out.println("===loop==="+i);
//		}
		
//		mainJava.testFile();
		
//		//String resouceStr = "2,12,13,14";
//		String resouceStr = "2";
//		String tobeRemoveStr = "2";
//		String  result = mainJava.removeStr(resouceStr, tobeRemoveStr);
//		System.out.println("===end==="+result);
		
		//Date date = new Date(1381557871000L); //2009-08-25 17:33:17  
		//Date date = new Date(1383274863009l); //2013/11/1 11:01:03
//		Date date = new Date(1356960346000l); //2013/11/1 11:01:03
		//System.out.println(date);
//		mainJava.getCurrentDateTime();
		
//		StringBuilder str = new StringBuilder("[");
//		str.append("{\"result\":\"").append("111").append("\"}").append("]");
//		System.out.println(str.toString());
		
		//mainJava.getGoodsInterestRate();

//		StringBuffer str = new StringBuffer("a");
//		String aa = str.substring(0, str.length()-1).toString();
//		String jsonStr = "[{name:\"test1\", nodes:[ {name:\"test1_1\"}, {name:\"test1_2\"}]}, {name:\"test2\", nodes:[ {name:\"test2_1\"}, {name:\"test2_2\"}]}]";
//		
//		 JSONArray data = JSONArray.parseArray(jsonStr);
//		 for(int i = 0 ; i<data.size(); i++){
//			 JSONObject jobj = (JSONObject)data.get(i);
//			 String name = jobj.getString("name");
//			 System.out.println("===name==="+name);
//		 }
		
//		mainJava.saveOrder4FastBuySync();
//		mainJava.shoppingCartOrderSync();
//		mainJava.getOrderDetailInfo();
//		byte a = 12;
//		System.out.println("===name==="+a);
//		
//		//List error=new ArrayList();
//		List error=null;
//		if (error.isEmpty()) {
//			System.out.println("===name===");
//		}
		
		/*
		String categoryIds = "2-103965,2-103968,2-104014";
		String[] categoryIds_ =  categoryIds.split(",");
		String id = "";
		if(categoryIds_.length > 0){
			Long[] paramCategoryId = new Long[categoryIds_.length];
			for (int i = 0; i < categoryIds_.length; i++) {
				String temp = categoryIds_[i].substring(categoryIds_[i].indexOf('-')+1);
				//paramCategoryId[i] = Long.valueOf(categoryIds_[i]);
				System.out.println("===i==="+i+"==="+categoryIds_[i].indexOf('-')+"===temp==="+temp);
			}
		}
		*/
		//Integer a = Integer.parseInt("-10");
		Integer a = 10;
		System.out.println("===loop==="+a);
		int x = Integer.highestOneBit((15 - 1) << 1);
		int threshold = (int) Math.min(16 * 0.75, 1000 + 1);
		System.out.println("===loop==="+x+"===threshold==="+threshold);
		
		double num = 111231.5585;  
	    BigDecimal b = new BigDecimal(num);
		BigDecimal orderAmount = b.multiply(b);
		System.out.println("===orderAmount==="+orderAmount);
		orderAmount = orderAmount.setScale(2, BigDecimal.ROUND_HALF_UP);
		System.out.println("===orderAmount==="+orderAmount);
		//		mainJava.hashMap();
		
		
		Date start = convertStrToDate("2019-01-16 16:00", "yyyy-MM-dd HH:mm");
		multiArray();
	}
	
	public static void multiArray() {
		int[][] children = {{1, 2}, {3}, {4}, {}, {}};
		System.out.println(children[0]);
        for (int child : children[0]) {
        	System.out.println(child);
        }
	}
	
	public static Date convertStrToDate(String dateStr, String dateFormat) {

		if (dateStr == null || dateStr.equals("")) {
			return null;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		try {
			return sdf.parse(dateStr);
		} catch (Exception e) {
			throw new RuntimeException("DateUtil.convertStrToDate():"
					+ e.getMessage());
		}
	}
	
	public void hashMap(){
		Map<String,String> bodyMap = new HashMap<String,String>();
		bodyMap.put("1", "1");
		bodyMap.put("2", "2");
		bodyMap.put("3", "3");
		bodyMap.put(null, null);
		bodyMap.put("4", "4");
//		bodyMap.entrySet();
//		bodyMap.keySet()
		for (String key : bodyMap.keySet()) {
//			System.out.println(key+ ":" + bodyMap.get(key));
		}
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
	    
		Set set = new HashSet();
		
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		for (int i = 0; i < list.size(); i++) {
			System.out.println();
		}
		
		LinkedHashMap linkedHashMap = new LinkedHashMap();
	}
	
	public void test(){
		 Collection collection1 = new ArrayList();// 创建一个集合对象
		 collection1.add("000");//添加对象到Collection集合中
		 collection1.add("111");
		 collection1.add("222");
		 System.out.println("集合collection1的大小："+collection1.size());
		 System.out.println("集合collection1的内容："+collection1);
		 collection1.remove("000");//从集合collection1中移除掉"000" 这个对象
		 System.out.println("集合collection1移除 000 后的内容："+collection1);
		 System.out.println("集合collection1中是否包含000 ："+collection1.contains("000"));
		 System.out.println("集合collection1中是否包含111 ："+collection1.contains("111"));
		 Collection
		 collection2=new
		 ArrayList();
		 collection2.addAll(collection1);//将collection1集合中的元素全部都加到collection2中
		 System.out.println("集合collection2的内容："+collection2);
		 collection2.clear();//清空集合collection1 中的元素
		 System.out.println("集合collection2是否为空 ："+collection2.isEmpty());
		 //将集合collection1转化为数组
		 Object s[]=
		 collection1.toArray();
		 for(int i=0;i<s.length;i++){
			 System.out.println(s[i]);
		 } 
	 } 
	
	public void getOrderDetailInfo(){
		 
		//String url = "http://192.168.26.88:8081/facadeHome.do?actions=facadeHome&method=getOrderDetailInfo";
		String url = "http://www.114yg.cn/facadeHome.do?actions=facadeHome&method=getOrderDetailInfo";
		System.out.println("===url==="+url+"===");
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(url); 
		String orderId = "1001002";
		
		NameValuePair[] params = 
			{
				new NameValuePair("WT", "json"),
				new NameValuePair("orderId", orderId)
			};
		
		method.setRequestBody(params); 
		method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		StringBuffer response = new StringBuffer(); 
		BufferedReader reader = null;
		try {
			client.executeMethod(method);
			System.out.println("===enterTrackContent===method.getStatusCode()==="+method.getStatusCode()+"===");
			if (method.getStatusCode() == HttpStatus.SC_OK) { 
				reader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), "UTF-8")); 
				String line; 
				while ((line = reader.readLine()) != null) { 
					response.append(line); 
				} 
				
				System.out.println("===response==="+response+"===");
//				JSONObject jobj = JSONObject.parseObject(response.toString());
//				System.out.println("===jobj==="+jobj+"===");
//				String result = jobj.getString("returnCode").toString();
//				System.out.println("===result==="+result+"===");
				
				JSONArray data = JSONArray.fromObject(response);
				if(data!=null && data.size() > 0){
					System.out.println("===data.size()==="+data.size()+"===");
					for(int i = 0; i < data.size();i++){
						JSONObject jobj = (JSONObject)data.get(i);
						if(jobj!=null){
							System.out.println("===jobj==="+jobj+"===");
							String result = jobj.getString("returnCode").toString();
							System.out.println("===result==="+result+"===");
						}
					}
				}
				
				reader.close(); 
				reader = null;
			} 
		} catch (Exception e ){
			System.out.println("===Exception==="+e.getMessage());
		} finally {
			if(reader!=null){
				reader = null;
			}
			method.releaseConnection();
			method = null;
			client = null;
		}
	}
	
	public void enterTrackContent(){
		 
		String url = "http://192.168.36.34:8081/facadeHome.do?actions=facadeHome&method=enterTrackContent";
		System.out.println("===url==="+url+"===");
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(url); 
		String goodsOrderId = "122971739";
		
		String tackingNo = "0";
		String tackingCompany = "";
		String remark = "上海市杨高南路5788号中国电信信息园区B13B幢二楼";// 订单备注
		
		NameValuePair[] params = 
			{
				new NameValuePair("goodsOrderId", goodsOrderId),
				new NameValuePair("tackingNo", tackingNo),
				new NameValuePair("tackingCompany", tackingCompany),
				new NameValuePair("remark", remark)
			};
		
		method.setRequestBody(params); 
		method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		StringBuffer response = new StringBuffer(); 
		BufferedReader reader = null;
		try {
			client.executeMethod(method);
			System.out.println("===enterTrackContent===method.getStatusCode()==="+method.getStatusCode()+"===");
			if (method.getStatusCode() == HttpStatus.SC_OK) { 
				reader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), "UTF-8")); 
				String line; 
				while ((line = reader.readLine()) != null) { 
					response.append(line); 
				} 
				
//				System.out.println("===response==="+response+"===");
//				JSONObject jobj = JSONObject.parseObject(response.toString());
//				System.out.println("===jobj==="+jobj+"===");
//				String result = jobj.getString("returnCode").toString();
//				System.out.println("===result==="+result+"===");
				
				JSONArray data = JSONArray.fromObject(response);
				if(data!=null && data.size() > 0){
					System.out.println("===data.size()==="+data.size()+"===");
					for(int i = 0; i < data.size();i++){
						JSONObject jobj = (JSONObject)data.get(i);
						if(jobj!=null){
							System.out.println("===jobj==="+jobj+"===");
							String result = jobj.getString("returnCode").toString();
							System.out.println("===result==="+result+"===");
						}
					}
				}
				
				reader.close(); 
				reader = null;
			} 
		} catch (Exception e ){
			System.out.println("===Exception==="+e.getMessage());
		} finally {
			if(reader!=null){
				reader = null;
			}
			method.releaseConnection();
			method = null;
			client = null;
		}
	}
	
	
	public void saveOrder4FastBuySync(){
		 
		String url = "http://192.168.36.122:8081/facadeHome.do?actions=facadeHome&method=saveOrder4FastBuySync";
		System.out.println("===url==="+url+"===");
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(url); 
		String userId = "122971739";
		String reservation = "114mall";
		String reserPhone = "13402167570";
		String receiver = "zhangliao";
		String recPhone = "13402167570";
		String cityId = "31,3101,310115";
		String recAddress = "上海市杨高南路5788号中国电信信息园区B13B幢二楼";
		String postCode = "201315";
		
		String isBill = "0";
		String billTitle = "";
		String billContent = "";
		String sendWay = "0";
		String payFlag = "11";	//支付方式
		String remark = "remark";// 订单备注
		
		//商品订单相关
		String mallGoodsOrderID = "9999999991";
//		String goodsID = "41476";
//		String goodsName = "eab_非cod_非入仓_上海运费";
		String goodsID = "41478";
		String goodsName = "eab_非cod_入仓有运费";
//		String goodsID = "41465";
//		String goodsName = "eab_cod_nonWarehousing_有运费";
		
		String goodsSupplyPrice = "50.01";
		String goodsSalesPrice = "60.01";
		String buyNum = "3";
		String orderPrice = "180.03";
		String freight = "15";
		String totalPrice = "195.03";
		NameValuePair[] params = 
			{
				new NameValuePair("userId", userId),
				new NameValuePair("reservation", reservation),
				new NameValuePair("reserPhone", reserPhone),
				new NameValuePair("receiver", receiver),
				new NameValuePair("recPhone", recPhone),
				new NameValuePair("cityId", cityId),
				new NameValuePair("recAddress", recAddress),
				new NameValuePair("postCode", postCode),
				new NameValuePair("payFlag", payFlag),
				new NameValuePair("sendWay", sendWay),
				new NameValuePair("isBill", isBill),
				new NameValuePair("billTitle", billTitle),
				new NameValuePair("billContent", billContent),
				new NameValuePair("remark", remark),
				new NameValuePair("orderPrice", orderPrice),
				new NameValuePair("freight", freight),
				new NameValuePair("totalPrice", totalPrice),
				new NameValuePair("goodsOrderID", mallGoodsOrderID),
				new NameValuePair("goodsID", goodsID),
				new NameValuePair("goodsName", goodsName),
				new NameValuePair("goodsSupplyPrice", goodsSupplyPrice),
				new NameValuePair("goodsSalesPrice", goodsSalesPrice),
				new NameValuePair("buyNum", buyNum)
			};
		
		method.setRequestBody(params); 
		method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		StringBuffer response = new StringBuffer(); 
		BufferedReader reader = null;
		try {
			client.executeMethod(method);
			System.out.println("===saveOrder4FastBuySync===method.getStatusCode()==="+method.getStatusCode()+"===");
			if (method.getStatusCode() == HttpStatus.SC_OK) { 
				reader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), "UTF-8")); 
				String line; 
				while ((line = reader.readLine()) != null) { 
					response.append(line); 
				} 
				
				System.out.println("===response==="+response+"===");
				JSONObject jobj = JSONObject.parseObject(response.toString());
				System.out.println("===jobj==="+jobj+"===");
				String result = jobj.getString("returnCode").toString();
				System.out.println("===result==="+result+"===");
				
//				JSONArray data = JSONArray.fromObject(response.toString());
//				if(data!=null && data.size() > 0){
//					System.out.println("===data.size()==="+data.size()+"===");
//					for(int i = 0; i < data.size();i++){
//						JSONObject jobj = (JSONObject)data.get(i);
//						if(jobj!=null){
//							System.out.println("===jobj==="+jobj+"===");
//							String result = jobj.getString("returnCode").toString();
//							System.out.println("===result==="+result+"===");
//						}
//					}
//				}
				
				reader.close(); 
				reader = null;
			} 
		} catch (Exception e ){
			System.out.println("===Exception==="+e.getMessage());
		} finally {
			if(reader!=null){
				reader = null;
			}
			method.releaseConnection();
			method = null;
			client = null;
		}
	}
	
	
	public void shoppingCartOrderSync(){
		 
		String url = "http://192.168.36.200:8081/facadeHome.do?actions=facadeHome&method=shoppingCartOrderSync";
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod(url); 
		String userId = "99999";
		String reservation = "114mall";
		String reserPhone = "13402167570";
		String receiver = "zhangliao";
		String recPhone = "13402167570";
		String cityId = "31,3101,310115";
		String recAddress = "上海市杨高南路5788号中国电信信息园区B13B幢二楼";
		String postCode = "201315";
		
		String isBill = "0";
		String billTitle = "";
		String billContent = "";
		String sendWay = "0";
		String payFlag = "11";	//支付方式
		String remark = "remark";// 订单备注
		
		//商品订单相关
		String orderPrice = "100.00";
		String freight = "6";
		String totalPrice = "106.00";
		
//		String orderPrice = "180.03";
//		String freight = "15";
//		String totalPrice = "195.03";
		
//		String orderPrice = "40.02";
//		String freight = "10";
//		String totalPrice = "50.02";
		
		String goodsOrderList = "[" +
				"{goodsOrderID:\"8888888881\", goodsID:\"41482\", goodsName:\"【六神】清新滋润沐浴露750ml\", goodsSupplyPrice:\"24.22\", goodsSalesPrice:\"29.50\", buyNum:\"1\", freight:\"1.77\"}" +
//				",{goodsOrderID:\"8888888882\", goodsID:\"41483\", goodsName:\"【蜂花】滋润护发素 450ml\", goodsSupplyPrice:\"9.17\", goodsSalesPrice:\"10.50\", buyNum:\"1\", freight:\"0.63\"}" +
				",{goodsOrderID:\"8888888883\", goodsID:\"41484\", goodsName:\"【江山】猕猴桃MHT-30个（约6斤)\", goodsSupplyPrice:\"58.00\", goodsSalesPrice:\"60.00\", buyNum:\"1\", freight:\"3.60\"}" +
				"]";
		NameValuePair[] params = 
			{
				new NameValuePair("mainOrderId", "8888888820"),
				new NameValuePair("userId", userId),
				new NameValuePair("reservation", reservation),
				new NameValuePair("reserPhone", reserPhone),
				new NameValuePair("receiver", receiver),
				new NameValuePair("recPhone", recPhone),
				new NameValuePair("cityId", cityId),
				new NameValuePair("recAddress", recAddress),
				new NameValuePair("postCode", postCode),
				new NameValuePair("payFlag", payFlag),
				new NameValuePair("sendWay", sendWay),
				new NameValuePair("isBill", isBill),
				new NameValuePair("billTitle", billTitle),
				new NameValuePair("billContent", billContent),
				new NameValuePair("remark", remark),
				new NameValuePair("orderPrice", orderPrice),
				new NameValuePair("freight", freight),
				new NameValuePair("totalPrice", totalPrice),
				new NameValuePair("goodsOrderList", goodsOrderList)
			};
		
		method.setRequestBody(params); 
		method.getParams().setParameter(HttpMethodParams.HTTP_CONTENT_CHARSET, "UTF-8");
		StringBuffer response = new StringBuffer(); 
		BufferedReader reader = null;
		try {
			client.executeMethod(method);
			System.out.println("===saveSaleOrder===method.getStatusCode()==="+method.getStatusCode()+"===");
			if (method.getStatusCode() == HttpStatus.SC_OK) { 
				reader = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream(), "UTF-8")); 
				String line; 
				while ((line = reader.readLine()) != null) { 
					response.append(line); 
				} 
				System.out.println("===response==="+response+"===");
				JSONObject jobj = JSONObject.parseObject(response.toString());
				System.out.println("===jobj==="+jobj+"===");
				String result = jobj.getString("returnCode").toString();
				System.out.println("===result==="+result+"===");
				
				reader.close(); 
				reader = null;
			} 
		} catch (Exception e ){
			System.out.println("===Exception==="+e.getMessage());
		} finally {
			if(reader!=null){
				reader = null;
			}
			method.releaseConnection();
			method = null;
			client = null;
		}
	}
	
	public Date getCurrentDateTime(){
		TimeZone time = TimeZone.getTimeZone("GMT+8"); //设置为东八区
		TimeZone.setDefault(time);// 设置时区
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println(date);
		return date;
	}
	
	public void getInterestRate(){
		
		Double goodsPrice = 39.9d;
		Double supplyPrice = 39.9d;
		Float taxRate = 0.17f;
		
		
		Double interestRate = 0d;
		BigDecimal interestRateBD ;
		
		Double a = goodsPrice/1.17 - supplyPrice / taxRate
            - (goodsPrice/1.17*0.17 - supplyPrice / taxRate * (taxRate-1)) * 0.13;
		
		interestRate = a / (goodsPrice/1.17) ;
		
		//System.out.println("===a==="+a);
		System.out.println("===interestRate==="+interestRate);
		
		BigDecimal taxRateBD = new BigDecimal(taxRate);
		BigDecimal additionalTaxRateBD = new BigDecimal("0.13");
		BigDecimal salesTaxRateBD = new BigDecimal("0.17");
		BigDecimal regularRateBD = new BigDecimal("1.17");
		BigDecimal otherFeeBD = new BigDecimal("0");
		
		BigDecimal supplyPriceBD = new BigDecimal(supplyPrice);
		BigDecimal goodsPriceBD = new BigDecimal(goodsPrice);
		
		BigDecimal aBD = goodsPriceBD.divide(regularRateBD,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP);
		System.out.println("===aBD==="+aBD);
		
		BigDecimal bBD = supplyPriceBD.divide(taxRateBD,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP);
		System.out.println("===bBD==="+bBD);
		
		BigDecimal cBD = aBD.multiply(salesTaxRateBD);
		System.out.println("===cBD==="+cBD);
		
		BigDecimal dBD = bBD.multiply((taxRateBD.subtract(new BigDecimal(1))));
		System.out.println("===dBD==="+dBD);
		
		BigDecimal resultBD = (aBD.subtract(bBD).subtract(((cBD.subtract(dBD)).multiply(additionalTaxRateBD)))).subtract(otherFeeBD);
		System.out.println("===resultBD==="+resultBD);
		
		interestRateBD = resultBD.divide(aBD,10,BigDecimal.ROUND_HALF_UP);
		System.out.println("===interestRateBD==="+interestRateBD);
		System.out.println("===interestRateBD==="+interestRateBD.floatValue());
	}
	
    /**
	 * 毛利率计算公式：
	 * [翼购价/1.17-供货价/采购增值税-(翼购价/1.17*0.17-供货价/采购增值税*（采购增值税-1）)*0.13-其他直接成本费用]/(翼购价/1.17)
	 * 
	 * 固定值0.13是附加税税率	additionalTaxRate
	 * 固定值0.17是销售税率	salesTaxRate
	 * 固定值1.17是销售税率 + 1	regularRate
	 * DEF_DIV_SCALE = 10; 除法运算时保留小数位默认值
	 * 其他直接成本费用 固定为0	otherFeeBD
	 * 对于活动商品计算商品毛利率，翼购价应该等于活动价，这点需要注意
	 */
    public BigDecimal getGoodsInterestRate(){
    	
		Double goodsPrice = 30d;
		Double supplyPrice = 43d;
		Float taxRate = 1.17f;
    	
    	BigDecimal additionalTaxRateBD = new BigDecimal("0.13");
    	BigDecimal salesTaxRateBD = new BigDecimal("0.17");
    	BigDecimal regularRateBD = new BigDecimal("1.17");
    	BigDecimal otherFeeBD = new BigDecimal("0");
    	
    	BigDecimal goodsPriceBD = new BigDecimal(goodsPrice!=null ? goodsPrice.toString() : "0");
    	BigDecimal supplyPriceBD = new BigDecimal(supplyPrice!=null ? supplyPrice.toString() : "0");
    	BigDecimal taxRateBD = new BigDecimal(taxRate!=null ? taxRate.toString() : "0");
		BigDecimal interestRateBD ;
		
		//翼购价/1.17
		BigDecimal aBD = goodsPriceBD.divide(regularRateBD,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP);
		System.out.println("===aBD==="+aBD);
		
		//供货价/采购增值税
		BigDecimal bBD = supplyPriceBD.divide(taxRateBD,DEF_DIV_SCALE,BigDecimal.ROUND_HALF_UP);
		System.out.println("===bBD==="+bBD);
		
		//翼购价/1.17*0.17
		BigDecimal cBD = aBD.multiply(salesTaxRateBD);
		System.out.println("===cBD==="+cBD);
		
		//供货价/采购增值税*（采购增值税-1）
		BigDecimal dBD = bBD.multiply((taxRateBD.subtract(new BigDecimal(1))));
		System.out.println("===dBD==="+dBD);
		
		//[翼购价/1.17-供货价/采购增值税-(翼购价/1.17*0.17-供货价/采购增值税*（采购增值税-1）)*0.13-其他直接成本费用]
		BigDecimal resultBD = (aBD.subtract(bBD).subtract(((cBD.subtract(dBD)).multiply(additionalTaxRateBD)))).subtract(otherFeeBD);
		
		//[翼购价/1.17-供货价/采购增值税-(翼购价/1.17*0.17-供货价/采购增值税*（采购增值税-1）)*0.13-其他直接成本费用]/(翼购价/1.17)
		interestRateBD = resultBD.divide(aBD,2,BigDecimal.ROUND_HALF_UP);
		
		System.out.println("===resultBD==="+resultBD);
		
		System.out.println("===interestRateBD==="+interestRateBD);
		System.out.println("===interestRateBD==="+interestRateBD.floatValue());
		
		return interestRateBD;
    }
	
	public void testFile(){
		String a = "src=/fck/2013-07-11/f8aab316-45d3-46d5-a0c1-10bf162d6ec3.jpg />";
		String b = "";
		int idx = a.indexOf("/fck/");
		System.out.println("===idx==="+idx);
		
		b = a.replaceAll("/fck/", "http://192.168.29.39/fck/");
		System.out.println("===b==="+b);
	}
	
	
	/**
	 * 从一个字符串中去掉指定的字符
	 * 
	 * @param resouceStr
	 *            原来的字符串(2,12,13,14)
	 * @param tobeRemoveStr
	 *            需要去掉的字符(2)
	 * @return 返回去除后的字符串(12,13,14)
	 */
	public static String removeStr(String resouceStr, String tobeRemoveStr) {
		String resultStr = "";
		String tempArr[] = null;
		if (tobeRemoveStr == null) {
			return tobeRemoveStr;
		}
		if (resouceStr == null) {
			return resouceStr;
		} else {
			tempArr = resouceStr.split(",");
		}
		ArrayList<String> list = new ArrayList<String>();
		if (tempArr != null && tempArr.length > 0) {
			for (int i = 0; i < tempArr.length; i++) {
				if (tobeRemoveStr.equals(tempArr[i])) {
					continue;
				} else {
					list.add(tempArr[i]);
				}
			}
		}

		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if (i == 0) {
					resultStr = list.get(i);
				} else {
					resultStr += "," + list.get(i);
				}
			}
		}
		return resultStr;
	}
	
	public void listToMap(){
		
		List<PubColumnReferenceDO>  settleStateList = new ArrayList<PubColumnReferenceDO>();
		PubColumnReferenceDO bean1 = new PubColumnReferenceDO();
		bean1.setTableCode("1");
		bean1.setColCode("1");
		bean1.setColValue("1");
		bean1.setColValueName("name1");
		settleStateList.add(bean1);
		
		PubColumnReferenceDO bean2 = new PubColumnReferenceDO();
		bean2.setTableCode("1");
		bean2.setColCode("1");
		bean2.setColValue("2");
		bean2.setColValueName("name2");
		settleStateList.add(bean2);
		
		Map<String,String> map = new HashMap<String,String>();
		if(settleStateList!=null && settleStateList.size()>0){
			PubColumnReferenceDO temp = new PubColumnReferenceDO();
			for(int i=0;i<settleStateList.size();i++){
				temp = (PubColumnReferenceDO)settleStateList.get(i);
				map.put(temp.getColValue(), temp.getColValueName());
			}
		}
		System.out.println("===map==="+map.get("1").toString());
	}
	
}
