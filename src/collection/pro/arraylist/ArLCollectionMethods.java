package collection.pro.arraylist;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ArLCollectionMethods {
	
	public static int getCapacity(ArrayList<?> l) throws Exception {
		Field dataField = ArrayList.class.getDeclaredField("elementData");
		dataField.setAccessible(true);
		return ((Object[]) dataField.get(l)).length;
		
	}

	public static void main(String[] args) throws Exception {

		ArrayList al = new ArrayList();
		al.add("java");
		al.add(100);
		al.add("pro");
		al.add(null);
		al.add(500);
		
		System.out.println("initial capacity : "+getCapacity(al));
		System.out.println("size of al arraylist :" +al.size() );
		
		al.trimToSize();
		System.out.println("initial capacity after triming : "+getCapacity(al));
		
		ArrayList al2 = new ArrayList();
		al2.add("vaibhav");
		al2.add("jay");
		al2.add(900);
		al2.add(null);
		al2.add(400);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
//		System.out.println(al.get(0));   first element of list.
		
//		System.out.println(al.get(al.size()-2));   find second last element in list
		
		al2.remove(1);
		System.out.println(al2);
		
//		al2.addAll(al);
//		System.out.println(al2);
		
//		System.out.println(al.contains(100));
		
//		System.out.println(al2.containsAll(al));
		
//		System.out.println(al.retainAll(al2));
		
//		System.out.println(al.equals(al2));
		
//		al.clear();
		
//		System.out.println(al.isEmpty());
		
//		System.out.println(al.removeAll(al2));
	
		
	}
		
	
	

}
