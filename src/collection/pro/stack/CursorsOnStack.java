package collection.pro.stack;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;
public class CursorsOnStack {

	public static void main(String[] args) {

		Stack s = new Stack();

		s.add("stack");
		s.add("java");
		s.add("pro");
		s.add(500);
		s.add("ram");

		//		Iterator itr = s.iterator();
		//		while(itr.hasNext()) {
		//			System.out.println(itr.next());
		//			s.add(100);
		//		}

		//		ListIterator lt = s.listIterator();
		//		while(lt.hasNext()) {
		//			System.out.println(lt.next());
		//			s.add(100);
		//		}

		Enumeration ev = s.elements();
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
			s.add(100);
		}
	}

}
