package Tushar.com;

import java.util.Scanner;

public class reversearray {

	public static void main(String[] args) {

		// remove a  array
				int n ;
				System.out.println("Enter the  size of aray element");
				Scanner sc = new Scanner(System. in);
				n= sc.nextInt();
				int a[] = new  int[n];
		System.out.println("Enter the aray element");
		for(int i =0 ;i<a.length ;i++)
		{
			
			a[i] = sc.nextInt();
		}

		for(int i =0 ;i<a.length ;i++)
		{
			System.out.println(" "+ a[i]);
		}
		
		System.out.println("Reverse of elements:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(" " + a[i]);
        }
		
		System.out.println(" size of array is " + a.length + " ");

	}

}
