package com.ComparatorAndComparable;

public class Student implements Comparable {

	int id;
	String std_name;

	public Student() {
		super();

	}

	public Student(int id, String std_name) {
		super();
		this.id = id;
		this.std_name = std_name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", std_name=" + std_name + "]";
	}

	@Override
	public int compareTo(Object o) {

//		Note --> 1. s1 object for sorting by id comparable.
//				 2. s2 object for sorting by string name comparable.
//				 3. and only one can run at a single time.
		
		Student s1 = (Student) o;
		if (this.id == s1.id)
			return 0;

		else if (this.id > s1.id)
			return 1;

		else
			return -1;

//		Student s2 = (Student) o;
//
//		int result = this.std_name.compareTo(s2.std_name);
//
//		return result;

	}

}
