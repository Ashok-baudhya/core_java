package exception_handel;

import java.util.Scanner;

public class Question_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		try {
			
			int ans = a/b;
			System.out.println(ans);
		}
		catch{
			
		}

	}

}
