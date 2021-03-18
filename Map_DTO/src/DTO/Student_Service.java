package DTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Student_Service {
	private Map<Integer, Student_SetGet> students;
	
	public Student_Service(HashMap<Integer, Student_SetGet> students) {
		this.students=students;
	}
	public Map<Integer, Student_SetGet> getAllStudent() {
		// TODO Auto-generated method stub
		return students;
	}
	public void delete(int key) {
		// TODO Auto-generated method stub
		students.remove(key);
	}
	public void deleteAll() {
		// TODO Auto-generated method stub
		students.clear();
	}
	public void update_name(int key, String name) {
		// TODO Auto-generated method stub
		Student_SetGet ss=students.get(key);
		ss.setName(name);
		//students.replace(key, name);
	}
	public void update_age(int key, int age) {
		// TODO Auto-generated method stub
		Student_SetGet ss=students.get(key);
		ss.setAge(age);
	}
	public void update_rollno(int key, int rollno) {
		// TODO Auto-generated method stub
		Student_SetGet ss=students.get(key);
		ss.setRollno(rollno);
	}
}
