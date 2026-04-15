package test;

public class Student {
	
	private int id , age ;
	private String name;
	
	public Student() {
		
	}
	
	public Student(String name , int age) {
		this.name = name;
		this.age = age;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}
