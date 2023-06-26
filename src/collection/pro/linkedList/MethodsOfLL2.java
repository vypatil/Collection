package collection.pro.linkedList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.ListIterator;

public class MethodsOfLL2 {
	
	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();

		l1.add("pro");
		l1.add("java1");
		l1.add("java2");
		l1.add("java3");
		l1.add("java3");
		l1.add("java3");
		l1.add(null);
		l1.add(500);
		l1.add("health");
		l1.add("boss");

		//		System.out.println(l1.peekFirst());
		//
		//		System.out.println(l1.peekLast());
		//
		//		System.out.println(l1.poll());
		//
		//		System.out.println(l1.pollFirst());
		//
		//		System.out.println(l1.pop());
		//
		//		l1.push("pushing on top");
		//		System.out.println(l1.pop());

		//	System.out.println(l1.removeFirstOccurrence("java1"));

		//	System.out.println(l1.removeLastOccurrence("java3"));

		//	System.out.println(l1.removeFirst());

		//	System.out.println(l1.removeLast());

		System.out.println(l1);

		System.out.println("<<<<<<<<<<<<<<<<<");
		ListIterator itr = l1.listIterator();
		while(itr.hasNext()) {

			System.out.println(itr.next());
		}


	}

}
