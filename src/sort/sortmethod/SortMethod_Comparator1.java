package sort.sortmethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sort.bean.Goods;
public class SortMethod_Comparator1 {
	public static void main(String[] args) {
		SortMethod_Comparator1.sortGoods();
	}
	public static void sortGoods(){
		List<Goods> list = new ArrayList<Goods>();
		
		Goods goods1 = new Goods();
		goods1.setId("1");
		goods1.setGoodsName("name1");
		goods1.setSalesCount(20);
		list.add(goods1);
		
		
		Goods goods2 = new Goods();
		goods2.setId("2");
		goods2.setGoodsName("name2");
		goods2.setSalesCount(17);
		list.add(goods2);
		
		
		Goods goods3 = new Goods();
		goods3.setId("3");
		goods3.setGoodsName("name3");
		goods3.setSalesCount(18);
		list.add(goods3);
		
		for (int i = 0; i < list.size(); i++) {
			Goods temp = (Goods)list.get(i);
			System.out.println("===id==="+temp.getId()+"===goodsName==="+temp.getGoodsName()+"===salesCount==="+temp.getSalesCount());
		}
		
		Collections.sort(list, new Comparator<Goods>(){
			@Override//以销量排序 从高到低
//			public int compare(Goods o1, Goods o2) {
//				return o1.getSalesCount()>o2.getSalesCount()?-1:(o1.getSalesCount()==o2.getSalesCount())?0:1;
//			}
			public int compare(Goods o1, Goods o2) {
				return o1.getSalesCount().compareTo(o2.getSalesCount());
			}
		});
		
		
		for (int i = 0; i < list.size(); i++) {
			Goods temp = (Goods)list.get(i);
			System.out.println("===id111==="+temp.getId()+"===goodsName==="+temp.getGoodsName()+"===salesCount==="+temp.getSalesCount());
		}
		
		String[] names = {"王林",  "杨宝", "李镇", "刘迪", "刘波"};  
		Arrays.sort(names, java.text.Collator.getInstance(java.util.Locale.SIMPLIFIED_CHINESE));//升序;   
		System.out.println(Arrays.toString(names));      
		
	}

}
