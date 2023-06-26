package collection.pro.hashset;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {

		Student s1 = new Student(10 , "ram");
		Student s2 = new Student(20 , "ram");
		Student s3 = new Student(20 , "ram");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

		HashSet hs = new HashSet();

		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));
		System.out.println(hs.add(s3));

		System.out.println(hs);
	}

}
  /*Note=
		1.In hashSet when we add element of student class without override equals and hashcode
		  method that time both method call via object class and check reference of objects
		  and add all 3 objects.

		  And we override the two methods that time we get content equality so we will get
		  false for adding same element of same content.*/