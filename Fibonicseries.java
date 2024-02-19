package Tushar.com;

import java.util.Scanner;

public class Fibonicseries {
	public static void main(String[] args) {
		int a = 0, b=1 ,c, n ;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		for(int i =0 ; i<=5 ;i++)
		{
			System.out.println(a+" ");
			 c = a+b;
			a=b;
			b=c;
		}
		
	}

}
