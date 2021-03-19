package DTO;

public class StudentDto {
	private String id;
	private String name;
	private String age;
	
	//Argument Constructor
	public StudentDto(String id,String name,String age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}

}
