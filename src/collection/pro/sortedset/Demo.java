package collection.pro.sortedset;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {

		SortedSet n1 = new TreeSet<>();

		n1.add(80);
		n1.add(52);
		n1.add(95);
		n1.add(15);
		n1.add(33);
		n1.add(10);


		System.out.println("first(lowest) element-->"+n1.first());

		System.out.println("last(highest) element-->"+n1.last());

		System.out.println(n1.headSet(15));
		
		System.out.println(n1.tailSet(15));
		
		System.out.println(n1.subSet(15, 80));
		
		
		System.out.println("Printing all elements --->"+n1);



	}
}
