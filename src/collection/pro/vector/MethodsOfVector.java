package collection.pro.vector;

import java.util.Enumeration;
import java.util.Vector;

public class MethodsOfVector  {
	
	public static void main(String[] args) {
		
		Vector v = new Vector();
		
		v.add("ram");
		v.add("vaibhav");
		v.add("oops");
		v.add("collection");
		v.add(500);
		v.add(null);
		
		System.out.println(v.firstElement());
		
		System.out.println(v.elementAt(3));
		
		System.out.println(v.lastElement());
		
		System.out.println(v.set(4, 200));
		
		System.out.println(v.remove(2));
		
		v.insertElementAt("java", 5);
		
		//v.removeAllElements();
		
		
		System.out.println("<<<<<<<<<>>>>>>>");
		Enumeration ev = v.elements();
		
		while(ev.hasMoreElements()) {
			
			System.out.println(ev.nextElement());
		}
		
		
	}

}
 
