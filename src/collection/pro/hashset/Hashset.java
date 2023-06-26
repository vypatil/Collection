package collection.pro.hashset;


import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class Hashset {

	public static void main(String[] args) {

		HashSet h = new HashSet<>();

		h.add("java");
		h.add("pro");
		h.add(null);
		h.add("pro");
		h.add("pro2");
		
		
		System.out.println(h);

		HashSet h2 = new HashSet<>();

		h2 = (HashSet) h.clone();
		h2.add("element");

		System.out.println("the new hashset ---> " + h2);
		System.out.println("size of object h = " + h.size());
		System.out.println("size of object h2 = " + h2.size());
		
		System.out.println(h.containsAll(h2));


		String o1 = new String("java");
		String o2 = o1;
		System.out.println(o1.equals(o2));
		
		String o3 = new String();
		System.out.println(o1.equals(o3));


	}

}
