package inheritance_lab;

public class current_Account extends Account{

	double balance = 204500;
	double Min_bal = 20000;
	double service_charge = 500;
	double palanty;
	
	void curr_deposite()
	{
		balance = super.deposite(balance);
	}
	
	void curr_withdraw()
	{
		balance = super.withdraw(balance);
		
	}
	
	void check_Bal()
	{
		if(balance< Min_bal)
		{
			balance = balance - service_charge;
			System.out.println("You have debited ammount "+ service_charge + " Because of Minimum Blance");
			System.out.println("Ammount after service charge : " + balance);
		}
	}
	
	void display()
	{
		super.display();
		System.out.println("Balance : "+ balance);
		check_Bal();
	}
}
