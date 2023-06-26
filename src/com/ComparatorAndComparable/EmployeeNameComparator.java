package com.ComparatorAndComparable;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		int result = e1.emp_name.compareTo(e2.emp_name);
		
		return result;
	}
	
	
}
