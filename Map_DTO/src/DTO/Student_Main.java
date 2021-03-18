package DTO;

import java.util.*;
public class Student_Main {
	HashMap<Integer, Student_SetGet> students=new HashMap<>();
	Student_Service studentservice=new Student_Service(students);
	Map<Integer, Student_SetGet> allstudents=studentservice.getAllStudent();
	
	Scanner sc=new Scanner(System.in);
	
	/*public int ValidId() {
		int id=-1;
		while(id<0) {
			try {
				System.out.println("Enter the Id ");
				id=sc.nextInt();
			}
			catch(Exception e) {
				System.out.println("Entered Id is wrong ! Please enter valid id");
				sc.next();
			}
		}
		return id;
		
	}*/
	public int ValidId() {
		int id;
		do {
		    System.out.println("Enter Id");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number! Enter Valid Id");
		        sc.next(); // this is important!
		    }
		    id = sc.nextInt();
		} while (id <= 0);
		return id;
		
	}
	
	public String ValidName() {
		System.out.println("Enter Name");
		    while (!sc.hasNext("[A-Za-z]*")) {
		        System.out.println("That's not a Name! Enter Valid Name");
		        sc.next(); // this is important!
		   }
		    String name = sc.next();
		return name;
	}
	
	public int ValidRollno() {
		int rollno;
		do {
		    System.out.println("Enter RollNo");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a  Rollno number! Enter Valid RollNo");
		        sc.next(); // this is important!
		    }
		    rollno = sc.nextInt();
		} while (rollno <= 0);
		
		return rollno;
		
	}
	public int ValidAge()  {
		int age;
		do {
		    System.out.println("Enter Age");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a Age number! Enter Valid Age");
		        sc.next(); // this is important!
		    }
		    age = sc.nextInt();
		} while (age <= 1);
		return age;
		
	}
	
	public int ValidKey() {
		int key;
		do {
		    System.out.println("Enter Key");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a Key number! Enter Valid Key");
		        sc.next(); // this is important!
		    }
		    key = sc.nextInt();
		} while (key <= 0);
		return key;
		
	}
	public int ValidInput() {
		int input;
		do {
		    //System.out.println("Enter Key");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a Key number! Enter Valid Input");
		        sc.next(); // this is important!
		    }
		    input = sc.nextInt();
		} while (input <= 0);
		return input;
		
	}
	
	public void Add() {
		/*System.out.println("Enter the Id ");
			//int id=sc.nextInt();
		int id = 0;
			if(sc.hasNextInt()) {
	            id = sc.nextInt();
	        }else {
	            System.out.println("Please Enter Valid Integer");
	            Add();
	        }
		System.out.println("Enter the Name");
			String name=sc.next();
		System.out.println("Enter the Roll Number");
			int rollno=sc.nextInt();
		System.out.println("Enter the Age");
			int age=sc.nextInt();*/
			
			int id=ValidId();
			String name=ValidName();
			int rollno=ValidRollno();
			int age=ValidAge();
			
			Student_SetGet st=new Student_SetGet(id,name,rollno,age);
			students.put(st.getId(), st);
			
			printStudentDetails(allstudents);
	}
	
	public void delete() {
		   System.out.println("What you want to delete");
		   System.out.println("1. Delete By Key");
		   System.out.println("2. Delete all");
		   System.out.println("3. Back");
		   
		   /*int num=sc.nextInt();*/
		   int num=ValidInput();
		   switch(num) {
		   case 1:
			   System.out.println("Which Student you want to delete");
			   printStudentDetails(allstudents);
			   /*System.out.println("Enter Key");
			   int key=sc.nextInt();*/
			   int key=ValidKey();
			   studentservice.delete(key);
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
			   CASE();
			   break;
		   default:
				System.out.println("Enter valid Input");
				delete();
				break;
		   }
	   }
	
	   public void update() {
		   System.out.println("What you want to Update");
		   System.out.println("1. Update Name");
		   System.out.println("2. update Roll No");
		   System.out.println("3. update Age");
		   System.out.println("4. Update All");
		   System.out.println("5. Back");
		   /*int num=sc.nextInt();*/
		   int num=ValidInput();
		   
		   switch(num) {
		   case 1:
			   printStudentDetails(allstudents);
			   /*System.out.println("Enter Key");
			   int key=sc.nextInt();*/
			   
			   /*System.out.println("Enter updated name");
			   String name=sc.next();*/
			   int key=ValidKey();
			   String name=ValidName();
			   //students.put(key, name);
			   studentservice.update_name(key,name);
			   allstudents =studentservice.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
			   
		   case 2:
			   printStudentDetails(allstudents);
			   /*System.out.println("Enter Key");
			   int key1=sc.nextInt();*/
			   
			   /*System.out.println("Enter updated Roll No");
			   int rollno=sc.nextInt();*/
			   int key1=ValidKey();
			   int rollno=ValidRollno();
			   studentservice.update_rollno(key1,rollno);
			   allstudents =studentservice.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
			   
		   case 3:
			   printStudentDetails(allstudents);
			   /*System.out.println("Enter Key");
			   int key2=sc.nextInt();
			   System.out.println("Enter updated Age");
			   int age=sc.nextInt();*/
			   int key2=ValidKey();
			   int age=ValidAge();
			   studentservice.update_age(key2,age);
			   allstudents =studentservice.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
			   
		   case 4:
			   printStudentDetails(allstudents);
			   /*System.out.println("Enter Key");
			   int key3=sc.nextInt();
			   System.out.println("Enter updated name");
			   String name1=sc.next();
			   System.out.println("Enter updated Roll Number");
			   int rollno1=sc.nextInt(); 
			   System.out.println("Enter updated Age");
			   int age2=sc.nextInt();*/
			   int key3=ValidKey();
			   String name1=ValidName();
			   int rollno1=ValidRollno();
			   int age2=ValidAge();
			   studentservice.update_name(key3,name1);
			   studentservice.update_rollno(key3,rollno1);
			   studentservice.update_age(key3,age2);
			   allstudents =studentservice.getAllStudent();
			   printStudentDetails(allstudents);
			   update();
			   break;
		   
		   case 5:
			   CASE();
			   break;
		   default:
				System.out.println("Enter valid Input");
				update();
				break;
	}
	   }
	   public void show() {
		   Map<Integer, Student_SetGet> allstudents =studentservice.getAllStudent();
			printStudentDetails(allstudents);
	   }
	 
	public void CASE() {
		   System.out.println("Enter a Value Which you want to perform operation");
			System.out.println("1. Insert Value");
			System.out.println("2. Delete Value");
			System.out.println("3. Update Value");
			System.out.println("4. View all value");
			Scanner sc=new Scanner(System.in);
			/*int num1=sc.nextInt();*/
			int input=ValidInput();
			
			switch(input) {
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
			default:
				System.out.println("Enter valid Input");
				CASE();
				break;
					
	   }
}
	
	
		
	
	public static void main(String[] args) {
		Student_Main sm=new Student_Main();
		sm.CASE();
		
		
		
		
	}
	private static void printStudentDetails(Map<Integer, Student_SetGet> allstudents) {
		// TODO Auto-generated method stub
		for(Map.Entry st : allstudents.entrySet()) {
			//System.out.println("key"+"   "+"Id"+"   "+"Name"+"   "+"RollNo"+"   "+"Age");
			System.out.println(st.getKey()+" "+st.getValue());
			
		}
	}
	
	
	

}


