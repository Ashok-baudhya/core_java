package class_lab;

import java.util.Scanner;

public class Bank_Account {


	String name,accountType;
	int accountNo;
	float amount; 
	Scanner sc = new Scanner(System.in);
	
	void accountDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Hloder Name : ");
		name = sc.nextLine();
		System.out.println("Enter Account Type : ");
		accountType = sc.nextLine();
		System.out.println("Enter Account no. : ");
		accountNo = sc.nextInt();
		System.out.println("Enter Amount : ");
		amount = sc.nextFloat();
	}
	
	float deposit()
	{
		System.out.println("Enter amount to deposite : ");
		int dep = sc.nextInt();
		amount+=dep;
		return amount;
	}
	
	double withdraw()
	{
		System.out.println("Enter amount to withdraw : ");
		int withdraw = sc.nextInt();
		amount-=withdraw;
		return amount;
	}
	
	void accountDisplay()
	{
		System.out.println("\n====== Account Details ======");
		System.out.println("\nAccount Name. : "+name);
		System.out.println("Account No. : "+accountNo);
		System.out.println("Account Type : "+accountType);
		System.out.println("Amount : "+amount);
	}
	
	public static void main(String[] args) {
		
		Bank_Account ac = new Bank_Account();
		
		ac.accountDetails();
		ac.deposit();
		ac.withdraw();
		ac.accountDisplay();

	}

}
