package collection.pro.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class MethodsOfLL {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();
		
		l1.add("java");
		l1.add(100);
		l1.add(null);
		l1.add("pro");
		l1.add("ram");
		
		System.out.println(l1.getFirst());
		
		System.out.println(l1.getLast());

		l1.addFirst("boss");
		System.out.println(l1.getFirst());
		
		l1.addLast("last addiing");
		System.out.println(l1.getLast());
		
		System.out.println(l1.element());
		
		l1.offer("offer element");
		System.out.println(l1.getLast());
		
		l1.offerFirst("offering first element");
		System.out.println(l1.getFirst());
		
		l1.offerLast("offering last element");
		System.out.println(l1.getLast());
		
		
		Iterator itr = l1.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		System.out.println("<<<<<<<<<<>>>>>>>>");
		
		
		ListIterator ob = l1.listIterator();
		
		while(ob.hasNext()) {
			
			System.out.println(ob.next());
			//l1.add("vaibhav");
			l1.remove(100);
			
		}
		
	}

}
