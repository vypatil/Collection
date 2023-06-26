package collection.pro.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArLOwnMethod {

	public static void main(String[] args) {
		
		ArrayList l1 = new ArrayList();
		l1.add("java");
		l1.add(100);
		l1.add(null);
		l1.add("team");
		l1.add("team");
		
		System.out.println(l1.indexOf(null));
		System.out.println(l1.lastIndexOf("team"));
		System.out.println(l1.get(2));
		System.out.println(l1.set(2, "exception"));
		System.out.println(l1);
		
		System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
		
		Iterator itr = l1.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
	}

	
}
