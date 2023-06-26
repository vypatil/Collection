package collection.pro.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArLSublistMethod {

	public static void main(String[] args) {


		ArrayList al = new ArrayList();

		al.add("hello");
		al.add(20);
		al.add("hi");
		al.add(40);
		al.add("hi");
		al.add("world");

		System.out.println(al);
		List al2 = al.subList(1, 5);
		System.out.println(al2);

		al.set(1, "mmmm");
		System.out.println(al);
		System.out.println(al2);
	}

}
