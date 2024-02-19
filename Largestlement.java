package Tushar.com;

import java.util.Scanner;

public class Largestlement {

	public static void main(String[] args) {
		// Find the Largest Elements 
		int a[]= {1,2,3,4,5,6,7,8,9,10}, max;
		
max =a[0];
for (int i = 0; i < a.length; i++)
{
	if(max < a[i])
	{
	max= a[i];
}
}
System.out.println("This is an largest elements in it " +max+ " ");
	}

}
