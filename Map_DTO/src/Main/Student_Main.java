package Main;

import java.util.*;

import DTO.Student_SetGet;
import Service.Student_Service;
public class Student_Main {
	HashMap<Integer, Student_SetGet> students=new HashMap<>();
	Student_Service studentservice=new Student_Service(students);
	Map<Integer, Student_SetGet> allstudents=studentservice.getAllStudent();
	
	Scanner sc=new Scanner(System.in);
	
	// Variables;
	   int st_key;
	   int st_rollno;
	   int st_age;
	   int st_id;
	   int inputValue;
	   int inputSwitch;
	   String st_name;
	
	// TO check Enter Id is Valid Or Not
	   public int ValidId() {
		do {
		    System.out.println("Enter Id");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number! Enter Valid Id");
		        sc.next(); 
		    }
		    st_id = sc.nextInt();
		} while (st_id <= 0);
		return st_id;
}
	
	// TO check Enter Name is Valid Or Not
	   public String ValidName() {
		System.out.println("Enter Name");
		    while (!sc.hasNext("[A-Za-z]*")) {
		        System.out.println("That's not a Name! Enter Valid Name");
		        sc.next(); 
		   }
		    st_name = sc.next();
		return st_name;
	}
	
	// TO check Enter Roll No is Valid Or Not
	   public int ValidRollno() {
		do {
		    System.out.println("Enter RollNo");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a  Rollno number! Enter Valid RollNo");
		        sc.next(); // this is important!
		    }
		    st_rollno = sc.nextInt();
		} while (st_rollno <= 0);
		return st_rollno;
	}
	
	// TO check Enter Age is Valid Or Not
	   public int ValidAge()  {
		do {
		    System.out.println("Enter Age");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a Age number! Enter Valid Age");
		        sc.next(); // this is important!
		    }
		    st_age = sc.nextInt();
		} while (st_age <= 1);
		return st_age;
	}
	
	// TO check Enter Key is Valid Or Not
	   public int ValidKey() {
		do {
		    System.out.println("Enter Id");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a Id number! Enter Valid Id");
		        sc.next(); // this is important!
		    }
		    st_key = sc.nextInt();
		} while (st_key <= 0);
		return st_key;
	}
	
	// TO check Enter Input for Switch-case is Valid Or Not
	   public int ValidInput() {
		do {
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a valid number! Enter Valid Input");
		        sc.next(); // this is important!
		    }
		    inputValue = sc.nextInt();
		} while (inputValue <= 0);
		return inputValue;
		
	}
	
	// TO Add/Insert Student Details
	   public void Add() {
			st_id=ValidId();
			st_name=ValidName();
			st_rollno=ValidRollno();
			st_age=ValidAge();
			
			Student_SetGet st=new Student_SetGet(st_id,st_name,st_rollno,st_age);
			students.put(st.getId(), st);
			
			printStudentDetails(allstudents);
	}
	
	// TO Delete Student Details 
	   public void delete() {
		   System.out.println("What you want to delete");
		   System.out.println("1. Delete By Key");
		   System.out.println("2. Delete all");
		   System.out.println("3. Back");
		   
		   inputSwitch=ValidInput();
		   switch(inputSwitch) {
		   case 1:
			   System.out.println("Which Student you want to delete");
			   printStudentDetails(allstudents);
			   st_key=ValidKey();
			   studentservice.delete(st_key);
			   allstudents =studentservice.getAllStudent();
			   printStudentDetails(allstudents);
			   delete();
			   break;
			   
		   case 2:
			   studentservice.deleteAll();
			   allstudents =studentservice.getAllStudent();
			   printStudentDetails(allstudents);
			   delete();
			   break;
			  
		   case 3:
			   For_Details();
			   break;
		   default:
				System.out.println("Enter valid Input");
				delete();
				break;
		   }
	   }
	
	// TO Update Student Details 
	  public void update() {
		   System.out.println("What you want to Update");
		   System.out.println("1. Update Name");
		   System.out.println("2. update Roll No");
		   System.out.println("3. update Age");
		   System.out.println("4. Update All");
		   System.out.println("5. Back");
		   
		   inputSwitch=ValidInput();
		   switch(inputSwitch) {
		   case 1:
			   printStudentDetails(allstudents);
			   st_key=ValidKey();
			   st_name=ValidName();
			   studentservice.update_name(st_key,st_name);
			   allstudents =studentservice.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
			   
		   case 2:
			   printStudentDetails(allstudents);
			    st_key=ValidKey();
			    st_rollno=ValidRollno();
			   studentservice.update_rollno(st_key,st_rollno);
			   allstudents =studentservice.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
			   
		   case 3:
			   printStudentDetails(allstudents);
			   st_key=ValidKey();
			   st_age=ValidAge();
			   studentservice.update_age(st_key,st_age);
			   allstudents =studentservice.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
			   
		   case 4:
			   System.out.println("1. Update All Name");
			   System.out.println("2. update All Rollno");
			   System.out.println("3. update All age");
			   System.out.println("4. Update All by id");
			   inputValue=ValidInput();
			   
			   switch(inputValue) {
			   case 1:
				   upate_allname();
				   break;
			   case 2:
				   upate_allrollno();
				   break;
			   case 3:
				   upate_allage();
				   break;
			   case 4:
				   printStudentDetails(allstudents);
				   st_key=ValidKey();
				   st_name=ValidName();
				   st_rollno=ValidRollno();
				   st_age=ValidAge();
				   studentservice.update_name(st_key,st_name);
				   studentservice.update_rollno(st_key,st_rollno);
				   studentservice.update_age(st_key,st_age);
				   allstudents =studentservice.getAllStudent();
				   printStudentDetails(allstudents);
				   update();
				   break;
			   }
			   
		   case 5:
			   For_Details();
			   break;
		   default:
				System.out.println("Enter valid Input");
				update();
				break;
	}
}
	  
	  //TO update all name
	  public void upate_allname() {
		  st_name=ValidName();
		  int size=students.size();
		  studentservice.update_allname(size,st_name);
		  allstudents =studentservice.getAllStudent();
		  printStudentDetails(allstudents);
		  update();
	  }
	  
	//TO update all Roll No
	  public void upate_allrollno() {
		  st_rollno=ValidRollno();
		  int size=students.size();
		  studentservice.update_allrollno(size,st_rollno);
		  allstudents =studentservice.getAllStudent();
		  printStudentDetails(allstudents);
		  update();
	  }
	  
	//TO update all Age
	  public void upate_allage() {
		  st_age=ValidAge();
		  int size=students.size();
		  studentservice.update_allage(size,st_age);
		  allstudents =studentservice.getAllStudent();
		  printStudentDetails(allstudents);
		  update();
	  }
	  
	// TO Print/View All Student Details 
	  public void show() {
		   Map<Integer, Student_SetGet> allstudents =studentservice.getAllStudent();
			printStudentDetails(allstudents);
	   }
	 
	// TO  Student Details in Map 
	  public void For_Details() {
		   System.out.println("Enter a Value Which you want to perform operation");
			System.out.println("1. Insert Value");
			System.out.println("2. Delete Value");
			System.out.println("3. Update Value");
			System.out.println("4. View all value");
			
			inputSwitch=ValidInput();
			
			switch(inputSwitch) {
			case 1:
				Add();
				For_Details();
				break;
			case 2:
				delete();
				For_Details();
				break;
			case 3:
				update();
				For_Details();
				break;
			case 4:
				show();
				For_Details();
				break;
			default:
				System.out.println("Enter valid Input");
				For_Details();
				break;
				}
			}
	
		// Main - Method
	  public static void main(String[] args) {
		Student_Main sm=new Student_Main();
		sm.For_Details();
		}
	
		// To Print All Student Value
	  private static void printStudentDetails(Map<Integer, Student_SetGet> allstudents) {
		for(Map.Entry st : allstudents.entrySet()) {
			System.out.println(st.getValue());
		}
	}
}


