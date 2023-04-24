package function_lab;

import java.util.Scanner;

public class binarySearch {
	
	int search(int arr[],int k)
	{
		int s=0;
		int l = arr.length-1;
	
		while(s<=l)
		{
			int mid=(s+l)/2;
			
			if(arr[mid]==k)
			{
				return mid;
			}
			else if(arr[mid]<k)
			{
				s=mid+1;
			}
			else
			{
				l=mid-1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.print("Enter value to search in array : ");
		int k = sc.nextInt();
		
		binarySearch b = new binarySearch();
		if(b.search(arr,k)==0) System.out.println("Not found");
		else System.out.println("At index : "+b.search(arr, k));

	}

}
