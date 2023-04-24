package function_lab;

import java.util.Scanner;

public class eBill {
	
	int sum;
	
	int bill(int n)
	{
		if(n>1 && n<=100)
		{
			return n*10;
		}
		else if(n>100 && n<=200)
		{
			return (100*10) + (n-100)*15;
			
		}
		else if(n>200 && n<=300)
		{
			return (100*10) + (100*15) + (n-200)*20;
		}
		else
		{
			return (100*10) + (100*15) + (100*20) + (n-300)*25;
		}
		
	}

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Electricity Unit : ");
	int n= sc.nextInt();
	eBill b = new eBill();
		System.out.println(b.bill(n));
	}

}
