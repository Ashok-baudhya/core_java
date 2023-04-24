package function_lab;
import java.util.*;

public class ConvertFC {
	
	static void farTOCel(float f)
	{
		float ans = (f-32)*5/9;
		
		System.out.println("Fahrenheit to Celsius = "+ans);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Fahrenheit : ");
		float n = sc.nextFloat();
		farTOCel(n);
	}	

}
