package DTO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
		   System.out.println("What you want to delete");
		   System.out.println("1. Delete By ID");
		   System.out.println("2. Delete all");
		   System.out.println("3. Back");
		   int num=sc.nextInt();
		   switch(num) {
		   case 1:
			   System.out.println("Which Student you want to delete");
			   printStudentDetails(allstudents);
			   System.out.println("Enter ID");
			   String n=sc.next();
			   studentResource.delete(n);
			   allstudents =studentResource.getAllStudent();
			   printStudentDetails(allstudents);
			   delete();
			   break;
			   
		   case 2:
			   studentResource.deleteAll();
			   allstudents =studentResource.getAllStudent();
			   printStudentDetails(allstudents);
			   delete();
			   break;
			  
		   case 3:
			   CASE();
			   break;
		   }
	   }
	   public void update() {
		   System.out.println("What you want to Update");
		   System.out.println("1. Update Name");
		   System.out.println("2. update Age");
		   System.out.println("3. Update All");
		   System.out.println("4. Back");
		   int num=sc.nextInt();
		   
		   switch(num) {
		   case 1:
			   printStudentDetails(allstudents);
			   System.out.println("Enter Index");
			   int num1=sc.nextInt();
			   System.out.println("Enter updated name");
			   String name1=sc.next();
			   studentResource.update_name(num1,name1);
			   allstudents =studentResource.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
			   
		   case 2:
			   printStudentDetails(allstudents);
			   System.out.println("Enter Index");
			   int num2=sc.nextInt();
			   System.out.println("Enter updated Age");
			   String age2=sc.next();
			   studentResource.update_age(num2,age2);
			   allstudents =studentResource.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
			   
		   case 3:
			   printStudentDetails(allstudents);
			   System.out.println("Enter Index");
			   int num3=sc.nextInt();
			   System.out.println("Enter updated name");
			   String name3=sc.next();
			   System.out.println("Enter updated Age");
			   String age3=sc.next();
			   studentResource.update_name(num3,name3);
			   studentResource.update_age(num3,age3);
			   allstudents =studentResource.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
		   
		   case 4:
			   CASE();
			   break;
	}
	   }
	   public void show() {
		   List<StudentDto> allstudents=studentResource.getAllStudent();
			printStudentDetails(allstudents);
	   }
	   
	 public void CASE() {
		   System.out.println("Enter a Value Which you want to perform operation");
			System.out.println("1. Insert Value");
			System.out.println("2. Delete Value");
			System.out.println("3. Update Value");
			System.out.println("4. View all value");
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
			case 4:
				show();
				CASE();
				break;
	   }
}
	public static void main(String[] args) {
		List<StudentDto> students=new ArrayList<>();
		StudentApp la=new StudentApp();
		la.CASE();
		
		/*StudentDto st1=new StudentDto("1","Vishal","21");
		students.add(st1);*/
		
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
