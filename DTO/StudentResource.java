package DTO;

import java.util.List;

public class StudentResource {
	private List<StudentDto> students;
	
	public StudentResource(List<StudentDto> students) {
		this.students=students;	
	}
	List<StudentDto> getAllStudent(){
		return students;
	}
	
	public void save(StudentDto student) {
		students.add(student);
	}
	public void delete(String studentId) {
		students.removeIf(student -> student.getId().equals(studentId));
	}
	public void update(int studentId, StudentDto name) {
		students.set(studentId, name);
	}
}
