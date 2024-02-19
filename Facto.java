package Tushar.com;

import java.util.Scanner;

public class Facto {

	public static void main(String[] args) {
		int f=1 , n;
		System.out.println("Enter rhe number");
		Scanner sc = new  Scanner(System.in);
		n=sc.nextInt();
		for(int i=1 ; i<=5 ; i++)
		{
			f=f*i;
			
		}
		System.out.println("Factorial of " + n + ": " + f);
	}

}
