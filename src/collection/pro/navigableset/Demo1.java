package collection.pro.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Demo1 {

	public static void main(String[] args) {

		NavigableSet n1 = new TreeSet();

		n1.add(100);
		n1.add(510);
		n1.add(54);
		n1.add(66);
		n1.add(50);
		n1.add(30);
		n1.add(10);

		System.out.println(n1.floor(500));
		System.out.println(n1.ceiling(51));

		System.out.println(n1.higher(10));
		System.out.println(n1.lower(510));

		System.out.println(n1);
	}
}
