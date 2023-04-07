package class_lab;

import java.util.Scanner;

public class Employee {

	int salary;
	float hrs;
	public void getinfo(int salary , float hrs)	{
		System.out.println("Employee Salary = "+salary);
		System.out.println("Employee Working hours = "+hrs);
	}
	public void AddSal() {
		if(salary<50000)
		{
			System.out.println("After Adding 10000 in salary = "+(salary+10000));
		}
		else {
			System.out.println("Employee salary greater than 50000 = "+salary);
		}
	}
	public void AddWork() {
		if(hrs>6)
		{
			System.out.println("Salary After overtime = "+(salary+5000));
		}
		else {
			System.out.println("Employee work less than 6 hrs = "+salary);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Employee ep = new Employee();
		System.out.println("Enter Employee Salary and Working hours");
		System.out.println("Salary");
		ep.salary= sc.nextInt();
		System.out.println("hrs");
		ep.hrs=sc.nextFloat();
		
		ep.getinfo(ep.salary, ep.hrs);
		ep.AddSal();
		ep.AddWork();
		
	}

}
