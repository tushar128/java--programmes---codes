package Tushar.com;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary Search
		int a[]= {10,20,30,40,50,60,70,80,90,100};
		int n= 90;
		int mid  , pos =-1 , f=0, l=a.length-1 ;
		while(f<= l)
		{
			mid = (f+l)/2;
			if(n==a[mid])
			{
				pos =mid ;
				System.out.println("Element is  found in mid  " + pos );
				break;
			}
			else if (n<=a[mid])
			{
				l= mid-1;
				
			}
			else 
			{
				f= mid + 1;
			}
			
		}
		if(pos== -1)
		{
			System.out.println("Element is not found ");
		}
		else
			System.out.println("Element is  found " + pos + " ");
	}

}
