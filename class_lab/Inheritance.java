package class_lab;

import java.util.Scanner;

class vehical
{
	String model_no;
	int price;
	String company;
	
	vehical()
	{
		System.out.println("vechical Details");
	}
	void input()
	{
		Scanner sc = new Scanner(System.in);
		model_no = sc.next();
		price = sc.nextInt();
		company = sc.next();
	}
}

 class bike extends vehical{
		bike()
		{
			System.out.println("Enter Bike details");
		}
		
		void display()
		{
			System.out.println(model_no +" "+price+" "+company);
		}
}

 class car extends vehical{
		car()
		{
			System.out.println("Enter Car Details");
		}
		void display()
		{
			System.out.println(model_no +" "+price+" "+company);
		}
}


public class Inheritance {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice 1 or 2");
		int n = sc.nextInt();
		
		if(n==1)
		{
			bike b= new bike();
			b.input();
			b.display();
		}
		else
		{
			car c= new car();
			c.input();
			c.display();
			
		}
		
		
		
	}

}
