package collection.pro.hashset;

import java.util.HashSet;

public class HashSetdemo {
	
	public static void main(String[] args) {
		
		HashSet h = new HashSet<>();
		
		System.out.println(h.add("AAA"));
		System.out.println(h.add("BBB"));
		System.out.println(h.add("AAA"));
		System.out.println(h.add("CCC"));
		System.out.println(h.add("DDD"));
		
		System.out.println(h);
	}

}
