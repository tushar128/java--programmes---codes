package Tushar.com;

import java.util.Scanner;

public class copyarray {

	public static void main(String[] args) {
		// Copy of array
		int n ;
		System.out.println("Enter the  size of aray element");
		Scanner sc = new Scanner(System. in);
		n= sc.nextInt();
		int a[] = new  int[n];
		int b[] = new int[n];
System.out.println("Enter the aray element");
for(int i =0 ;i<a.length ;i++)
{
	
	a[i] = sc.nextInt();
}
System.out.println("Print the  First aray element");
for(int i =0 ;i<a.length ;i++)
{
	System.out.println(" "+ a[i]);
}

System.out.println("Print the  Second aray element");
for(int i =0 ;i<a.length ;i++)
{
	b[i]=a[i];
	
	System.out.println(" "+ b[i]);
}
	}

}
