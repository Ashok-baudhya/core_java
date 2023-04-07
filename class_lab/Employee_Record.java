package class_lab;



import java.util.Scanner;

/*
 *  wap to ask 6 employee record from  user using get and display method
 *  show record on console after performing sorting on record on basis of employee id.
 */
class Employee1
{
	String name;
	int empid;
	int salary;
	void get()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter name ,empid salary");
		name= s.next();
		empid= s.nextInt();
		salary=s.nextInt();
		
				
	}
	void display()
	{
		System.out.println(name +"   "+ empid +"   "+ salary);
	}
	
	void sort(Employee1 k[])
	{
		Employee1 temp= new Employee1();
		
		for(int i=0;i<k.length;i++)
		{
			for(int j=0;j<k.length-1-i;j++)
			{
				if(k[i].salary> k[i+1].salary)
				{
					temp= k[i];
					k[i]=k[i+1];
					k[i+1]=temp;
				}
			}
		}
	}
}
public class Employee_Record{

	public static void main(String[] args) {
		 
		Employee1 e[]= new Employee1[7];
		Employee1 m= new Employee1();
		
		for(int i=0;i<e.length;i++)
		{
			e[i]= new Employee1();
			e[i].get();
			
		}
		
		m.sort(e);
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
			
		}
	}
}
