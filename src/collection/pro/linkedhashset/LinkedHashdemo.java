package collection.pro.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashdemo {

	public static void main(String[] args) {
		
		LinkedHashSet lh = new LinkedHashSet();
		
		lh.add("java");
		lh.add("pro");
		lh.add("wings");
		lh.add(null);
		lh.add("vaibhav");
		
		System.out.println(lh);
	}
}
