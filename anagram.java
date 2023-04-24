import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	
	boolean anagram_check (String str1 , String str2)
	{
		String str1L = str1.toLowerCase(); 
		String str2L = str2.toLowerCase();
		
		if(str1L.length() != str2L.length())
		{
			return false;
		}
		
		char[] s1 = str1L.toCharArray();
		char[] s2 = str2L.toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		for(int i=0;i<s1.length;i++)
		{
			if(s1[i]!=s2[i])
			{
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st String : ");
		String str1 = sc.next();
		System.out.print("Enter 2st String : ");
		String str2 = sc.next();
		anagram a = new anagram();
		
		if(a.anagram_check(str1,str2)==true)
		{
			System.out.println("\nString are Anagram : YES");
		}
		else
		{
			System.out.println("\nString are Anagram : NO");
		}
	}

}
