package collection.pro.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetComparatorTest {

	public static void main(String[] args) {

		Person p1 = new Person(88 , "ram");
		Person p2 = new Person(20 , "java");
		Person p3 = new Person(33 , "boss");
		
		PersonNumberComparator obj = new PersonNumberComparator();
		
		TreeSet ts = new TreeSet<>(obj);
		
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("<<<<<<<<<<<>>>>>>>>>>");
		
		PersonNameComparator obj2 = new PersonNameComparator();
		
		TreeSet ts2 = new TreeSet<>(obj2);
		
		ts2.add(p1);
		ts2.add(p2);
		ts2.add(p3);
		
		Iterator itr2 = ts2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}

}
