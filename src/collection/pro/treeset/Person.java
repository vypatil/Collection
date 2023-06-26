package collection.pro.treeset;

public class Person {

	int number;
	String name;
	
	public Person() {
		super();
		
	}

	public Person(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [number=" + number + ", name=" + name + "]";
	}
	
	
}
