package collection.pro.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetComparableTest {

	public static void main(String[] args) {
		
		// Sorting by id comparison
		
		Employee e1 = new Employee(23,"vaibhav");
		Employee e2 = new Employee(3,"java");
		Employee e3 = new Employee(5,"pro");
		
		TreeSet t1 = new TreeSet<>();
		
		t1.add(e3);
		t1.add(e2);
		t1.add(e1);
		
		Iterator itr1 = t1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("<<<<<<<<<<<<<< sorting by name comparison >>>>>>>>>>> ");
		
		Employee2 obj1 = new Employee2(50, "zebra");
		Employee2 obj2 = new Employee2(10, "Agra");
		Employee2 obj3 = new Employee2(20, "mumbai");
		
		TreeSet t2 = new TreeSet<>();
		
		t2.add(obj3);
		t2.add(obj2);
		t2.add(obj1);
		
		Iterator itr2 = t2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
