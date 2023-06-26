package collection.pro.hashset;

import java.util.HashSet;

public class HashSetHashCollision {


	public static void main(String[] args) {

		String s1 = "FB";

		String s2 = "Ea";

		System.out.println("Hashcode code of s1 --> " +s1.hashCode());
		System.out.println("Hashcode code of s2 --> " +s2.hashCode());


		System.out.println(s1.hashCode()==s2.hashCode());

		HashSet<String> hs = new HashSet<>();

		System.out.println(hs.add(s1));
		System.out.println(hs.add(s2));

		System.out.println(hs);
	}
}
