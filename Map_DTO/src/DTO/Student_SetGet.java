package DTO;

public class Student_SetGet {
	private int id;
	private String name;
	private int rollno;
	private int age;
	
	//Argument Constructor
	public Student_SetGet(int id, String name, int rollno, int age) {
		super();
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	 // To String Method
	@Override
	public String toString() {
		return "[" + id + "   " + name + "   " + rollno + "     " + age + "]";
	}
}
