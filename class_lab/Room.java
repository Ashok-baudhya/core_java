package class_lab;

import java.util.Scanner;

public class Room {

	int room_no;
	String roomType;
	float room_area;
	String ac_machine;
	
	void setdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Room no. = ");
		room_no=sc.nextInt();
		System.out.print("Enter Room Type = ");
		roomType = sc.next();
		System.out.print("Enter Room Area = ");
		room_area = sc.nextFloat();
		System.out.print("AC Machine = ");
		ac_machine = sc.next();
	}
	void displaydata()
	{
		System.out.println("\n====== Room Details ======");
		System.out.println("\nRoom no. : "+room_no);
		System.out.println("Room Type : "+roomType);
		System.out.println("Room Area : "+room_area);
		System.out.println("AC Machine : "+ac_machine);
	}
	
	public static void main(String[] args) {
		
		Room rm = new Room();
		
		rm.setdata();
		rm.displaydata();
	}

}
