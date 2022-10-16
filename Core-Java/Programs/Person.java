package first;

public class Person {
	
	private String name ;
	private int age;
	private Address add;
	
	
	
	public Person(String name, int age, Address add) {
		this.name = name;
		this.age = age;
		this.add = add;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", add=" + add + "]";
	}
	
	
	

}
