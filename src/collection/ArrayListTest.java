package collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayListTest test = new ArrayListTest();
		test.arrayList();
//		test.sublist();
	}
	
	public void arrayList(){
		ArrayList arraylist = new ArrayList();// 创建一个集合对象
		arraylist.add("000");//添加对象到Collection集合中
		arraylist.add(null);
		arraylist.add("222");
		arraylist.add("111");
		arraylist.add("444");
		arraylist.add("555");
//		arraylist.remove(null);
//		arraylist.set(2, "333");
//		arraylist.add(1, "xxx");
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(""+arraylist.get(i));
		}
		
		LinkedList list = new LinkedList();
		list.add("1");
		list.add("2");
		list.add(null);
		list.add("3");
		list.add("4");
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(""+list.get(i));
		}
		
		String[] EMPTY_ELEMENTDATA = {};
		String[] elementData = EMPTY_ELEMENTDATA;
		int size = 0;
		elementData = Arrays.copyOf(elementData, 10);
		elementData[size++] = "a";
		System.out.println("===elementData.length==="+elementData.length+"===elementData.length==="+elementData.length);
		elementData[size++] = "b";
		elementData[size++] = "c";
		System.out.println("elementData.length==="+elementData.length);
		for (int i = 0; i < elementData.length; i++) {
			System.out.println(elementData[i]);
		}
	}
	
	public void listIterator(){
		ArrayList arraylist = new ArrayList();// 创建一个集合对象
		arraylist.add("000");//添加对象到Collection集合中
		arraylist.add(null);
		arraylist.add("222");
		arraylist.add("111");
		arraylist.add("444");
		arraylist.add("555");
		
		ListIterator itr = arraylist.listIterator();
		for (Iterator iterator = itr; iterator.hasNext();) {
			Object object = (Object) iterator.next();
//			System.out.println(""+object);
		}
	}
	
	public void iterator(){
		ArrayList arraylist = new ArrayList();// 创建一个集合对象
		arraylist.add("000");//添加对象到Collection集合中
		arraylist.add(null);
		arraylist.add("222");
		arraylist.add("111");
		arraylist.add("444");
		arraylist.add("555");
		
		for (Iterator iterator = arraylist.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(""+object);
		}
	}
	
	public void sublist(){
		List arraylist = new ArrayList();// 创建一个集合对象
		arraylist.add("000");//添加对象到Collection集合中
		arraylist.add(null);
		arraylist.add("222");
		arraylist.add("111");
		arraylist.add("444");
		arraylist.add("555");
		arraylist.add("666");
		
		List arraylist2 = arraylist.subList(1, 4);
		
		for (Iterator iterator = arraylist2.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(""+object);
		}
	}
}
