package collection.pro.stack;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Stack;

public class MethodsOfStack {

	public static void main(String[] args) {

		Stack s = new Stack<>();
		
		s.add(100);
		s.add("Stack");
		s.add("pro");
		s.add("ram");
		s.add("shree");
		s.add("hanuman");
		
		ArrayList al = new ArrayList();
		al.add("java");
		al.add(100);
		al.add("pro");
		al.add(null);
		al.add(500);
		
		System.out.println(s.empty());
		
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		
		System.out.println(s.push(999));
		
		System.out.println(s.search("ram"));
		
		System.out.println(s.addAll(al));	// ArrayList object holding
		
		
		System.out.println("****************************");
		Enumeration ev = s.elements();
		
		while(ev.hasMoreElements()) {
			System.out.println(ev.nextElement());
		}
	}

}
