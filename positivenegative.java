package Tushar.com;

import java.util.Scanner;

public class positivenegative {

	public static void main(String[] args) {
		// Chek positive negative number
		int n ;
		System.out.println("Enter the number ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("+ number");
		}
		else if(n<0)
		{
			System.out.println("- number");
		}
		else
			System.out.println(" number is eual to zero 0 ");
	}

}
