package collection.pro.treeset;

public class Employee implements Comparable {
	
	int id;
	String name;
	
	
	public Employee() {
		super();
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Object o) { //comparable - by id comparison
		
		Employee other = (Employee) o;
		
		if(this.id == other.id )
			return 0;
		
		else if(this.id > other.id)
			return 1;
		
		return -1;
	}
	
	

}
