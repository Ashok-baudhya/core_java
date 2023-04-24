package inheritance_lab;

public class saving_Account extends Account{
	
	double balance = 120500;
	double intr ;
	
	 void sav_deposite()
	{
		 balance = super.deposite(balance);
	}
	
	void sav_withdraw()
	{
		balance = super.withdraw(balance);
		
	}
	void intrest()
	{
		intr = (balance*2)/100;
		intr +=balance;
	}
	
	void display()
	{
		super.display();
		System.out.println("Balance : "+ balance);
		System.out.println("Total Ammount with intrest : " + intr);

	}
}
