package exception_handel;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a,b;
		
		try {
			System.out.print("Enter the first Integer : ");
			 a = sc.nextInt();
			System.out.print("Enter the Second Integer : ");
			 b = sc.nextInt();
			
			if(b==0)
			{
				throw new ArithmeticException("Error : division by Zero");
			}
			System.out.println(a +" / "+ b+" = "+(a/b));
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Error : Invalid Input");
		}

	}

}
