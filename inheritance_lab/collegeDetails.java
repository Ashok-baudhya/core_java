package inheritance_lab;

import java.util.Scanner;

interface College{
	String College_name ="C Dac";
}


class Teacher{
	String name ;
	String Qualification;
	
	Scanner sc = new Scanner(System.in);
	
	public Teacher()
	{
		System.out.print("Enter Name : ");
		name = sc.nextLine();
		System.out.print("Enter Qualification : ");
		Qualification = sc.next();
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Qualification : "+Qualification);
	}
}

class Departement extends Teacher{
	int dept_no;
	String Dept_name;
	
	public Departement() {
		
		System.out.print("Enter Dept. no. : ");
		dept_no =sc.nextInt();
		System.out.print("Enter Dept. Name : ");
		Dept_name = sc.next();
		
	}
	
	void display() {
		super.display();
		System.out.println("Dept. no. : "+dept_no);
		System.out.println("Dept. Name : "+Dept_name);
	}
}


public class collegeDetails implements College {

	public static void main(String[] args) {
		
			Departement d = new Departement();
			System.out.println("\n+++++++++++++++++ Employee Details +++++++++++++++++");
			System.out.println("College Name : "+ College.College_name );
			d.display();
	}

}
