import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


public class JsonMainJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JsonMainJava mainJava = new JsonMainJava();
		
		mainJava.ListTojsonStrTest();
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
	
	public void ListTojsonStrTest(){
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
		
		String result = JSONObject.toJSONString(settleStateList);
		
		System.out.println("===result==="+result);
		
	}
	public void jsonStrToListTest(){
		String jsonResult ="{goodsCategorys:"+ 
			"[" +
			"{id:\"100030\", name:\"食品饮料\"}" +
			",{id:\"100030\", name:\"食品饮料\"}" +
			"]"+
			"}";
		
		
		/**/
        List goodsTypeList = new ArrayList();
        if(jsonResult!=null && !"".equals(jsonResult)){
        	JSONObject jsonObj = JSONObject.parseObject(jsonResult.toString());
        	System.out.println("===jsonObj==="+jsonObj+"===");
        	String result = jsonObj.getString("goodsCategorys").toString();
        	System.out.println("===result==="+result+"===");
        	
        	JSONArray data = JSONArray.fromObject(result);
			if(data!=null && data.size() > 0){
				for(int i = 0; i < data.size();i++){
					JSONObject jobj = (JSONObject)data.get(i);
					if(jobj!=null){
						String goodsTypeId = jobj.getString("id")!=null?jobj.getString("id"):"";
						String goodsTypeName = jobj.getString("name")!=null?jobj.getString("name"):"";
						
						System.out.println("===goodsTypeId==="+goodsTypeId+"===");
						System.out.println("===goodsTypeName==="+goodsTypeName+"===");
					}
				}
			}
		}
		 
		
		
	}
	
}
