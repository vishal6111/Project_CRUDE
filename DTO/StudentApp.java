package DTO;

import java.io.Serializable;
import java.util.*;

import CRUD.List_Add;
public class StudentApp {
	List<StudentDto> students=new ArrayList<>();
	StudentResource studentResource=new StudentResource(students);
	List<StudentDto> allstudents=studentResource.getAllStudent();
	Scanner sc=new Scanner(System.in);
	   public void Add() {
		System.out.println("Enter the Id ");
			String s=sc.nextLine();
		System.out.println("Enter the Name");
			String s1=sc.nextLine();
		System.out.println("Enter the Age");
			String s2=sc.nextLine();
			StudentDto st1=new StudentDto(s,s1,s2);
			students.add(st1);
			
			printStudentDetails(allstudents);
	}
	   public void delete() {
		   System.out.println("Which Student you want to delete");
		   printStudentDetails(allstudents);
		   System.out.println("Enter ID");
			String n=sc.nextLine();
			studentResource.delete(n);
			allstudents =studentResource.getAllStudent();
			printStudentDetails(allstudents);
}
	   public void update() {
		   System.out.println("Which student you want to update");
		   printStudentDetails(allstudents);
		   System.out.println("Enter Index");
			int n3=sc.nextInt();
			System.out.println("Enter updated name");
		
			StudentDto n=students.get(0);
		    StudentDto name =students.set(n3,n);
			/*Serializable name;
			 name=sc.next();*/
			studentResource.update(n3,name);
			allstudents =studentResource.getAllStudent();
			printStudentDetails(allstudents);
		   
	   }
	   void CASE() {
		   System.out.println("Enter a Value Which you want to perform operation");
			System.out.println("1. Insert Value");
			System.out.println("2. Delete Value");
			System.out.println("3. Update Value");
			Scanner sc=new Scanner(System.in);
			int num1=sc.nextInt();
			
			switch(num1) {
			case 1:
				Add();
				CASE();
				break;
			case 2:
				delete();
				CASE();
				break;
			case 3:
				update();
				CASE();
				break;
	   }
}
	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		String s="3";
		String s1="Yashwant";
		String s2="23";*/
		List<StudentDto> students=new ArrayList<>();
		StudentApp la=new StudentApp();
		la.CASE();
		
		/*StudentDto st1=new StudentDto("1","Vishal","21");
		StudentDto st2=new StudentDto("2","Vivek","22");
		StudentDto st3=new StudentDto(s,s1,s2);
		students.add(st1);
		students.add(st2);
		students.add(st3);*/
		
		/*StudentResource studentResource=new StudentResource(students);*/
		
		/*System.out.println("All Student : -");
		List<StudentDto> allstudents=studentResource.getAllStudent();
		printStudentDetails(allstudents);*/
		
		/*System.out.println("Delete user with id");
		String n="2";
		studentResource.delete(n);
		allstudents =studentResource.getAllStudent();
		printStudentDetails(allstudents);
		
		System.out.println("Adding new");
		StudentDto st4=new StudentDto("4","Rahul","25");
		studentResource.save(st4);
		allstudents =studentResource.getAllStudent();
		printStudentDetails(allstudents);*/
		
	}
	private static void printStudentDetails(List<StudentDto> allstudents) {
		// TODO Auto-generated method stub
		allstudents.forEach(student->System.out.println(student.getId()+" "+student.getName()+" " +student.getAge()));
	}

}
