package function_lab;
import java.util.*;

public class foodBill {
	
	int pizza;
	int puffs;
	int cooldrink;
	int total;
	
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The no of pizzas bought : ");
		pizza =sc.nextInt();
		System.out.print("Enter the no of puffs bought : ");
		puffs = sc.nextInt();
		System.out.print("Enter the no of cool drinks bought : ");
		cooldrink = sc.nextInt();
		
	}
	
	void output()
	{
		total = (100*pizza)+(20*puffs)+(10*cooldrink);
		System.out.println("\n============Bill Details=============");
		System.out.println("\nNo of pizzas : "+pizza);
		System.out.println("No of puffs : "+puffs);
		System.out.println("No of cooldrinks : " +cooldrink);
		System.out.println("Total Price : "+total);
	}
	
	public static void main(String[] args) {
		
		foodBill mv = new foodBill();
		mv.getData();
		mv.output();
	}

}
