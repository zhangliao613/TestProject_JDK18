package sort.sortmethod;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import sort.bean.Goods;

public class SortMethod1 {
	public static void main(String[] args) {
		SortMethod1.sortGoods();
	}
	public static void sortGoods(){
		List<String> list = new ArrayList();
		
		list.add("刘媛媛");

		list.add("王硕");
		list.add("李明");
		list.add("刘迪");
		list.add("刘布");

		//升序
		Collections.sort(list,Collator.getInstance(java.util.Locale.CHINA));//注意：是根据的汉字的拼音的字母排序的，而不是根据汉字一般的排序方法
		for(int i=0;i<list.size();i++)
		{
		    System.out.println(list.get(i));
		}
		System.out.println("");

		//降序
		Collections.reverse(list);//不指定排序规则时，也是按照字母的来排序的
		for(int i=0;i<list.size();i++)
		{
		     System.out.println(list.get(i));
		}
		
	}

}
