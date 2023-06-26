package collection.pro.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class CursorsOnVector {

	public static void main(String[] args) {

		Vector v = new Vector();
		
		v.add("java");
		v.add("pro");
		v.add("shree");
		v.add("ram");
		v.add(100);
		v.add(null);
		
//		Iterator itr = v.iterator();
//		
//		while(itr.hasNext()) {
//			
//			System.out.println(itr.next());
//			v.add(null);
//		}
		
//		ListIterator ob = v.listIterator();
//		
//		while(ob.hasNext()) {
//			
//			System.out.println(ob.next());
//			v.add(null);
//		}
		
		Enumeration ev = v.elements();
		
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
			v.add("jay");
			
		}
	}

}
