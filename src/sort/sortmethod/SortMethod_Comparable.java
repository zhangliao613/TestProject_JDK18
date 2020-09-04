package sort.sortmethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sort.bean.GoodsBean_Comparable;

public class SortMethod_Comparable {
	public static void main(String[] args) {
		SortMethod_Comparable.sortGoods();
	}
	public static void sortGoods(){
		List<GoodsBean_Comparable> list = new ArrayList<GoodsBean_Comparable>();
		
		GoodsBean_Comparable goods1 = new GoodsBean_Comparable();
		goods1.setId("1");
		goods1.setGoodsName("name1");
		goods1.setSalesCount(20);
		list.add(goods1);
		
		
		GoodsBean_Comparable goods2 = new GoodsBean_Comparable();
		goods2.setId("2");
		goods2.setGoodsName("name2");
		goods2.setSalesCount(17);
		list.add(goods2);
		
		
		GoodsBean_Comparable goods3 = new GoodsBean_Comparable();
		goods3.setId("3");
		goods3.setGoodsName("name3");
		goods3.setSalesCount(18);
		list.add(goods3);
		
		for (int i = 0; i < list.size(); i++) {
			GoodsBean_Comparable temp = (GoodsBean_Comparable)list.get(i);
			System.out.println("===id==="+temp.getId()+"===goodsName==="+temp.getGoodsName()+"===salesCount==="+temp.getSalesCount());
		}
		
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			GoodsBean_Comparable temp = (GoodsBean_Comparable)list.get(i);
			System.out.println("===id111==="+temp.getId()+"===goodsName==="+temp.getGoodsName()+"===salesCount==="+temp.getSalesCount());
		}
		
	}

}
