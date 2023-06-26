package collection.pro.vector;

import java.util.TreeSet;

import com.ComparatorAndComparable.Employee;
import com.ComparatorAndComparable.EmployeeIdComparator;
import com.ComparatorAndComparable.EmployeeNameComparator;

public class TestComparator {

	public static void main(String[] args) {

		Employee o1 = new Employee(78, "vaibhav");
		Employee o2 = new Employee(5, "zebra");
		Employee o3 = new Employee(6, "agra");

		EmployeeIdComparator object = new EmployeeIdComparator();

		TreeSet t1 = new TreeSet(object);

		t1.add(o1);
		t1.add(o2);
		t1.add(o3);

		System.out.println(t1);

		Employee o4 = new Employee(30, "ram");
		Employee o5 = new Employee(90, "dham");
		Employee o6 = new Employee(60, "sita");

		EmployeeNameComparator object2 = new EmployeeNameComparator();

		TreeSet t2 = new TreeSet(object2);
		t2.add(o6);
		t2.add(o4);
		t2.add(o5);

		System.out.println(t2);

	}

}
