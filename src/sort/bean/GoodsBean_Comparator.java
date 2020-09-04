package sort.bean;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GoodsBean_Comparator{
	public String id;
	public String goodsName;
	public Integer salesCount;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Integer getSalesCount() {
		return salesCount;
	}
	public void setSalesCount(Integer salesCount) {
		this.salesCount = salesCount;
	}
	
	
	class MyComparetor implements Comparator
	{
		@Override
	    public int compare(Object o1, Object o2)
	    {
	    	 GoodsBean_Comparator sdto1= (GoodsBean_Comparator )o1;
	    	 GoodsBean_Comparator sdto2= (GoodsBean_Comparator )o2;
	         return sdto1.getSalesCount().compareTo(sdto2.getSalesCount());
	    }
	}
	
	public static void main(String[] args)
	{
		List<GoodsBean_Comparator> list = new ArrayList<GoodsBean_Comparator>();
		
		GoodsBean_Comparator goods1 = new GoodsBean_Comparator();
		goods1.setId("1");
		goods1.setGoodsName("name1");
		goods1.setSalesCount(20);
		list.add(goods1);
		
		
		GoodsBean_Comparator goods2 = new GoodsBean_Comparator();
		goods2.setId("2");
		goods2.setGoodsName("name2");
		goods2.setSalesCount(17);
		list.add(goods2);
		
		
		GoodsBean_Comparator goods3 = new GoodsBean_Comparator();
		goods3.setId("3");
		goods3.setGoodsName("name3");
		goods3.setSalesCount(18);
		list.add(goods3);

		MyComparetor mc = new MyComparetor();

	    Collections.sort(list,mc);     //按照age升序 22，23，

//	    Collections.reverse(list);    //按照age降序 23,22   

	}

}
