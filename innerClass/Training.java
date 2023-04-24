package innerClass;

import java.util.Scanner;

public class Training {

	int studentId;
	String name;
	String address;
	long phone;
	int marks;
	
	Scanner sc = new Scanner(System.in);
	
	public Training() {
		System.out.println("Enter Name");
		name = sc.next();
		System.out.println("Enter Student ID");
		studentId = sc.nextInt();
		System.out.println("Enter Address");
		address = sc.next();
		System.out.println("Enter Phone");
		phone = sc.nextLong();
		System.out.println("Enter Marks");
		marks = sc.nextInt();
	}
	
	class onlineTraining{
		
		Float duration;
		
		void getData()
		{
			System.out.println("Enter Duration");
			duration = sc.nextFloat();
			
		}
		
		void showData()
		{
			System.out.println("=============Offline Student Details===============");
			System.out.println("Name : "+name);
			System.out.println("Student ID : "+studentId);
			System.out.println("Address : "+address);
			System.out.println("Phone : "+phone);
			System.out.println("Duration : "+duration+" Hours");
			System.out.println("Marks : "+marks);
		}
	}
	
	class offlineTranning{
		
		boolean systemAlloc;
		
		void input()
		{
			System.out.println("Enter System Allocation (True/False)");
			systemAlloc = sc.nextBoolean();
		}
		
		void display()
		{
			System.out.println("=============Offline Student Details===============");
			System.out.println("Name : "+name);
			System.out.println("Student ID : "+studentId);
			System.out.println("Address : "+address);
			System.out.println("Phone : "+phone);
			System.out.println("System Allocation : "+systemAlloc);
			System.out.println("Marks : "+marks);
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Online Training : 1");
		System.out.println("Offline Training : 2");
		System.out.println("Enter Your choice");
		
		int n = sc.nextInt();
		
		
		if(n==1)
		{	Training t = new Training();
			Training.onlineTraining ot = t.new onlineTraining();
			ot.getData();
			ot.showData();
			
			
		}else if(n==2)
		{
			Training t = new Training();
			Training.offlineTranning ft = t.new offlineTranning();
			ft.input();
			ft.display();
			
		}
		else {
			System.out.println("Wrong Input");
		}
		
	}
}
