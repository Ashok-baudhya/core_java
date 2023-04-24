package inheritance_lab;

import java.util.Scanner;

class vehicle{
	
	String company;
	float price;
	Scanner sc = new Scanner(System.in);
	
	public vehicle() {
		
		System.out.print("Enter Name Of Company : ");
		company = sc.next();
		System.out.print("Enter Price : ");
		price = sc.nextFloat();
	}
	
	public void display()
	{
		System.out.println("Company Name : "+company +" Price : "+price);
	}
}

class LightMotorVehicle extends vehicle{
	
	float mileage;

	public LightMotorVehicle() {
		System.out.print("Enter Mileage : ");
		mileage = sc.nextFloat();
	}	
	
	public void display()
	{
		super.display();
		System.out.println("Mileage : "+ mileage);
	}
}

class HeavyMotorVehicle extends vehicle{
	
	float capacityInTons;

	public HeavyMotorVehicle() {
		System.out.print("Enter Capacity In Tons : ");
		 capacityInTons = sc.nextFloat();
	}
	public void display()
	{
		super.display();
		System.out.println("Capacity In Tons : "+ capacityInTons);
	}
}


public class vehical_info {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("For Lignt Vehicle : 1");
		System.out.println("For Heavy Vehicle : 2");
		System.out.println("Enter Yout Choice ");
		
		int n = sc.nextInt();
		
		
		if(n==1)
		{
			System.out.println("Enter the Number Of Light Vehicle");
			int l = sc.nextInt();
			LightMotorVehicle lv[] = new LightMotorVehicle[l];
			for(int i=0;i<l;i++)
			{
				lv[i] = new LightMotorVehicle();
			}
			System.out.println("\n====================Vehicle Details=========================");
			for(int i=0;i<l;i++)
			{
				
				lv[i].display();
			}
			
		}
		else if(n==2)
		{
			System.out.println("Enter the Number Of Heavy Vehicle");
			int h = sc.nextInt();
			HeavyMotorVehicle hv[] = new HeavyMotorVehicle[h];
			for(int i=0;i<h;i++)
			{
				hv[i] = new HeavyMotorVehicle();
			}
			System.out.println("\n====================Vehicle Details=========================");
			for(int i=0;i<h;i++)
			{
				hv[i].display();
			}
			
		}
		else
		{
			System.out.println("Wrong Input");
		}
		
	}

}
