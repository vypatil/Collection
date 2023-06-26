package collection.pro.map;
import java.util.*;
import java.util.Map.Entry;
public class HashMaping {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "vaibhav");
		hm.put(2, "java");



		for (Entry<Integer, String> entry : hm.entrySet()) 
			System.out.println("Key = " + entry.getKey() +
					", Value = " + entry.getValue());


	}
}
