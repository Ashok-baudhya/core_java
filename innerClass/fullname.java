package innerClass;

import java.util.Scanner;

public class fullname {
	
	static void show_name(String name)
	{
		String str[] =name.split(" ");
		
		System.out.println("\nFirst Name : "+str[0]);
		System.out.println("Middle Name : "+str[1]);
		System.out.println("Last Name : "+str[2]);
	}

	public static void main(String[] args) {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Full Name");
		name = sc.nextLine();
		show_name(name);
		
	}

}
