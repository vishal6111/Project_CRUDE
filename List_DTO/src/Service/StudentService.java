package Service;

import java.util.List;

import DTO.StudentDto;
public class StudentService {
	private List<StudentDto> students;
	public StudentDto Sd_Obj;
	
	//TO Save all List Value
	public StudentService(List<StudentDto> students) {
		this.students=students;	
	}
	
	//TO Show all student details
	public List<StudentDto> getAllStudent(){
		return students;
	}
	
	//To Add the student Details 
	public void save(StudentDto student) {
		students.add(student);
	}
	
	//To Delete the student details by Id
	public void delete(String studentId) {
		students.removeIf(student -> student.getId().equals(studentId));
	}
	
	//To Delete All student details
	public void deleteAll() {
		students.removeAll(students);
		System.out.println("Empty Details");
	}
	
	//To Update the student Name
	public void update_name(int studentId, String studentName) {
		
		Sd_Obj=students.get(studentId);
		Sd_Obj.setName(studentName);
	}
	
	//To Update the student age
	public void update_age(int studentId,String studentAge) {
		Sd_Obj=students.get(studentId);
		Sd_Obj.setAge(studentAge);
	}

}
