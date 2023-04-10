package class_lab;

import java.util.Scanner;

public class add_func {
	
	int add(int a, int b)
	{
		;
		return a+b ;
	}
	
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
	
	int add(int a, int b, int c, int d)
	{
		return a+b+c+d;
	}
	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the a , b , c , d values");
	int a = sc.nextInt();
	int b =sc.nextInt();
	int c =sc.nextInt();
	int d = sc.nextInt();
	
	add_func ad = new add_func();
	
	System.out.println("\na + b = "+ad.add(a, b));
	System.out.println("a + b + c = "+ad.add(a, b, c));
	System.out.println("a + b + c + d = "+ad.add(a, b, c, d));
	}
}
