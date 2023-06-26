package collection.pro.treeset;

import java.util.Comparator;

import org.omg.CORBA.PERSIST_STORE;

public class PersonNumberComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		Person p1 = (Person) o1;
		Person p2 = (Person) o2;
		
		if(p1.number == p2.number)
			
			return 0;
		
		else if(p1.number > p2.number)
			
			return 1;
		
		else
		
		return -1;
	}

	
}
