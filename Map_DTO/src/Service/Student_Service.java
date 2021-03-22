package Service;

import java.util.HashMap;
import java.util.Map;
import DTO.Student_SetGet;

public class Student_Service {
	private Map<Integer, Student_SetGet> students;
	Student_SetGet obj;
	
	//TO save all the Value
	public Student_Service(HashMap<Integer, Student_SetGet> students) {
		this.students=students;
	}
	
	//To Print all the value 
	public Map<Integer, Student_SetGet> getAllStudent() {
		return students;
	}
	
	//To delete Value by Id
	public void delete(int key) {
		students.remove(key);
	}
	
	//To delete all the value
	public void deleteAll() {
		students.clear();
		System.out.println("[Empty Map]");
	}
	
	//To update Name by Id
	public void update_name(int key, String name) {
		obj=students.get(key);
		obj.setName(name);
	}
	
	//TO update Age by Id
	public void update_age(int key, int age) {
		obj=students.get(key);
		obj.setAge(age);
	}
	
	//TO update Roll No by Id
	public void update_rollno(int key, int rollno) {
		obj=students.get(key);
		obj.setRollno(rollno);
	}

	public void update_allname(int size, String st_name) {
		for(int i=1;i<=size;i++) {
			obj=students.get(i);
			obj.setName(st_name);
		  }
	}
	public void update_allrollno(int size, int st_rollno) {
		for(int i=1;i<=size;i++) {
			obj=students.get(i);
			obj.setRollno(st_rollno);
		  }
	}
	public void update_allage(int size, int st_age) {
		for(int i=1;i<=size;i++) {
			obj=students.get(i);
			obj.setAge(st_age);
		  }
	}
	
}
