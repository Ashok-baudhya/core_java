package class_lab;
import java.util.Scanner;
class Employee1
{
	String name;
	int empid;
	int salary;
	void get()
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter name ,Empid ,Salary");
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
		
		for(int i=0;i<k.length-1;i++)
		{
			for(int j=0;j<k.length-1-i;j++)
			{
				if(k[j].empid> k[j+1].empid)
				{
					temp= k[j];
					k[j]=k[j+1];
					k[j+1]=temp;
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
			System.out.print((i+1)+" ");
			e[i].get();
			
		}
		
		m.sort(e);
		
		System.out.println("After sorting on the basis of Emp ID");
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
			
		}
	}
}
