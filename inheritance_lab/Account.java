package inheritance_lab;

import java.util.Scanner;

public class Account {
	
	String name;
	int account_no;
	String account_type;
	Scanner sc = new Scanner(System.in);
	
	Account()
	{
		System.out.print("Enter Account Holder Name : ");
		name = sc.nextLine();
		System.out.print("Enter Account Type : ");
		account_type = sc.next();
		System.out.print("Enter Account no. : ");
		account_no = sc.nextInt();
	}
	
	double deposite(double balance)
	{
		 System.out.print("Enter Deposite Ammount : ");
		 double dep_bal = sc.nextDouble();
		 balance = balance + dep_bal;
		 System.out.println("Ammount after Deposite : "+balance);
		 return balance;
	}
	
	double withdraw(double balance)
	{
		System.out.print("Enter Withdraw Ammount : ");
		double withdraw_bal = sc.nextDouble();
		if(withdraw_bal>balance)
		{
			System.out.println("Insufficient Blance");
			System.out.println("Balance "+ balance);
			return balance;
			
		}
			balance = balance - withdraw_bal;
			System.out.println("Ammount after Withdraw : "+balance);
			return balance;
		
	}
	
	void display()
	{
		System.out.println("\n=============Account Details=============");
		System.out.println("Account Holder Name : "+ name);
		System.out.println("Account Type : "+ account_type);
		System.out.println("Account no. : " + account_no);

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======Enter Your choice=======");
		System.out.println("For Saving Account : 1");
		System.out.println("For Current Account : 2");
		int n = sc.nextInt();
		
		if(n==1) {
			
		saving_Account sv = new saving_Account();
		sv.sav_deposite();
		sv.sav_withdraw();
		sv.intrest();
		sv.display();
		
		}
		else if(n==2){
			current_Account cv = new current_Account();
			cv.curr_deposite();
			cv.curr_withdraw();
			cv.display();
			
		}
		else
		{
			System.out.println("Wrong Input");
			System.out.println("Exit");
		}
	}

}
