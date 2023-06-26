package com.ComparatorAndComparable;

import java.util.TreeSet;

public class TestStudent {

	public static void main(String[] args) {
		
		Student o1 = new Student(23 , "abhi");
		Student o2 = new Student(55 , "maddy");
		Student o3 = new Student(3 , "zebra");
		
		TreeSet t1 = new TreeSet();
		
		t1.add(o2);
		t1.add(o3);
		t1.add(o1);
		
		System.out.println(t1);
		
	}
}
