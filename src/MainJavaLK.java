
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class MainJavaLK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MainJavaLK.groupCount2();
	}
	
	public static void groupCount(){
		MainJavaLK mainJava = new MainJavaLK();
		List list = mainJava.initList();
		Iterator it = null;
		Double totalGoodsPrice = 0.0;
		it = list.iterator();   
		Integer totalBuyNums = 0;
        if (list != null && list.size() != 0) {   
            HashMap map = new HashMap();   
            while (it.hasNext()) {
            	MainBean mainBean = (MainBean) it.next();   
            	MainBean mainBeanMap = (MainBean) map.get(mainBean.getEmployeeId());   
				System.out.println("===mainBean==="+mainBean);
				System.out.println("===mainBeanMap==="+mainBeanMap);
                System.out.println();
                System.out.println();
                if (mainBeanMap == null) {   
                    map.put(mainBean.getEmployeeId(), mainBean);   
                } else {
                	totalGoodsPrice = totalGoodsPrice + mainBeanMap.getGoodsPrice() * mainBeanMap.getBuyNum()
                		+mainBean.getGoodsPrice() * mainBean.getBuyNum();
                    mainBeanMap.setTotalGoodsPrice(totalGoodsPrice);
                    System.out.println("===totalGoodsPrice==="+totalGoodsPrice);
                    System.out.println();
                    
                    Integer totalBuyNum = mainBeanMap.getTotalBuyNum()+mainBean.getTotalBuyNum();
                    mainBeanMap.setTotalBuyNum(totalBuyNum);
                    
                    it.remove();
                }   
            }   
        }  
		/**/
        it = list.iterator();   
        while (it.hasNext()) {   
            System.out.println(it.next());   
        }  
		
	}
	
	public static void groupCount2(){
		MainJavaLK mainJava = new MainJavaLK();
		List<MainBean> list = mainJava.initList();
		
		List<MainBean> mainList = new ArrayList<MainBean>();
		Map<String, MainBean> map = new HashMap<String, MainBean>();
		MainBean totalBean = null;
	    String employeeId = null;
		for(MainBean mainBean : list) {
			employeeId = mainBean.getEmployeeId();
			if (!map.containsKey(employeeId)) {
				totalBean = new MainBean();
				totalBean.setEmployeeId(employeeId);
				totalBean.setBuyNum(mainBean.getBuyNum());
				totalBean.setGoodsPrice(mainBean.getGoodsPrice());
				totalBean.setTotalBuyNum(mainBean.getTotalBuyNum());
				totalBean.setFreight(mainBean.getFreight());
				totalBean.setTotalGoodsPrice(mainBean.getGoodsPrice() * mainBean.getBuyNum());
				totalBean.setTotalPrice(mainBean.getGoodsPrice() * mainBean.getBuyNum() + mainBean.getFreight());
				mainList.add(totalBean);
				map.put(employeeId, totalBean);
			} else {
				totalBean = map.get(employeeId);
				totalBean.setTotalBuyNum(totalBean.getTotalBuyNum() + mainBean.getTotalBuyNum());
				totalBean.setFreight(totalBean.getFreight() + mainBean.getFreight());
				totalBean.setTotalGoodsPrice(totalBean.getTotalGoodsPrice() + mainBean.getGoodsPrice() * mainBean.getBuyNum());
				totalBean.setTotalPrice(totalBean.getTotalPrice() + 
						mainBean.getGoodsPrice() * mainBean.getBuyNum() + mainBean.getFreight());
			}
		}
		
		for(MainBean mainBean : mainList) {
			System.out.println(mainBean.toString());
		}
		
		
	}
	
	public List initList(){
		List goodsCarVoList = new ArrayList();
		MainBean bean1 = new MainBean();
		bean1.setEmployeeId("1");
		bean1.setGoodsId("101");
		bean1.setBuyNum(1);
		bean1.setTotalBuyNum(1);
		bean1.setGoodsPrice(1.0d);
		bean1.setFreight(1.0);
		
		goodsCarVoList.add(bean1);
		
		MainBean bean2 = new MainBean();
		bean2.setEmployeeId("2");
		bean2.setGoodsId("102");
		bean2.setBuyNum(2);
		bean2.setTotalBuyNum(2);
		bean2.setGoodsPrice(2.0d);
		bean2.setFreight(2.0);
		
		goodsCarVoList.add(bean2);
		
		MainBean bean3 = new MainBean();
		bean3.setEmployeeId("1");
		bean3.setGoodsId("103");
		bean3.setBuyNum(3);
		bean3.setTotalBuyNum(3);
		bean3.setGoodsPrice(3.0d);
		bean3.setFreight(3.0);
		
		goodsCarVoList.add(bean3);
		
		MainBean bean4 = new MainBean();
		bean4.setEmployeeId("2");
		bean4.setGoodsId("104");
		bean4.setBuyNum(4);
		bean4.setTotalBuyNum(4);
		bean4.setGoodsPrice(4.0d);
		bean4.setFreight(4.0);
		
		goodsCarVoList.add(bean4);
		
		MainBean bean5 = new MainBean();
		bean5.setEmployeeId("1");
		bean5.setGoodsId("105");
		bean5.setBuyNum(5);
		bean5.setTotalBuyNum(5);
		bean5.setGoodsPrice(5.0d);
		bean5.setFreight(5.0);
		
		goodsCarVoList.add(bean5);
		
		MainBean bean6 = new MainBean();
		bean6.setEmployeeId("2");
		bean6.setGoodsId("106");
		bean6.setBuyNum(6);
		bean6.setTotalBuyNum(6);
		bean6.setGoodsPrice(6.0d);
		bean6.setFreight(6.0);
		
		goodsCarVoList.add(bean6);
		
		MainBean bean7 = new MainBean();
		bean7.setEmployeeId("1");
		bean7.setGoodsId("107");
		bean7.setBuyNum(7);
		bean7.setTotalBuyNum(7);
		bean7.setGoodsPrice(7.0d);
		bean7.setFreight(7.0);
		goodsCarVoList.add(bean7);
		
		MainBean bean8 = new MainBean();
		bean8.setEmployeeId("2");
		bean8.setGoodsId("108");
		bean8.setBuyNum(8);
		bean8.setTotalBuyNum(8);
		bean8.setGoodsPrice(8.0d);
		bean8.setFreight(8.0);
		goodsCarVoList.add(bean8);
		
		return goodsCarVoList;
	}

}
