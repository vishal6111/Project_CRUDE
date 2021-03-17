package DTO;

import java.util.List;
public class StudentResource {
	private List<StudentDto> students;
	public String ss;
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
	public void update_name(int studentId, String name1) {
		
		StudentDto ss=students.get(studentId);
		ss.setName(name1);
		
		//String s1=ss.getName();
		//if(ss.getId().equals(studentId)) {
		//}
	//	System.out.println(ss.getName()+" "+ss.getAge()+" "+ss.getId());
			//String num=Integer.toString(studentId);
	}
	public void update_age(int studentId,String age1) {
		StudentDto ss=students.get(studentId);
			ss.setAge(age1);
	}
	public void deleteAll() {
		students.removeAll(students);
	}

}
