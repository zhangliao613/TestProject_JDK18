package sort.sortmethod;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sort.bean.GoodsBean_Comparator;

public class SortMethod_Comparator {
	public static void main(String[] args) {
		SortMethod_Comparator.sortGoods();
	}
	public static void sortGoods(){
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
		
		for (int i = 0; i < list.size(); i++) {
			GoodsBean_Comparator temp = (GoodsBean_Comparator)list.get(i);
			System.out.println("===id==="+temp.getId()+"===goodsName==="+temp.getGoodsName()+"===salesCount==="+temp.getSalesCount());
		}
		
//		Collections.sort(list, new Comparator<GoodsBean_Comparator>(){
//			public int compare(GoodsBean_Comparator o1, GoodsBean_Comparator o2) {
//				return o1.getSalesCount().compareTo(o2.getSalesCount());
//			}
//		});
		
//		Collections.sort(list,Collator.getInstance(java.util.Locale.CHINA));//注意：是根据的汉字的拼音的字母排序的，而不是根据汉字一般的排序方法
		
		MyComparetor mc = new MyComparetor();
		
		Collections.sort(list,GoodsBean_Comparator);
		for (int i = 0; i < list.size(); i++) {
			GoodsBean_Comparator temp = (GoodsBean_Comparator)list.get(i);
			System.out.println("===id111==="+temp.getId()+"===goodsName==="+temp.getGoodsName()+"===salesCount==="+temp.getSalesCount());
		}
		
	}

}
