package collection.pro.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArlProgram {
	
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("java");
		al.add("pro");
		al.add("vaibhav");
		al.add(null);
		al.add(100);
		
		
		System.out.println(al);  // printing whole arraylist
		
		System.out.println("<<<<<<<<<<<>>>>>>>>>>");
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
		System.out.println("<<<<<<<<<<<>>>>>>>>>>");

		
		System.out.println("print second last element of arraylist -->" + al.get(al.size()-2));
		
		System.out.println("print first element of arraylist --> " + al.get(0));
		
	}

}
