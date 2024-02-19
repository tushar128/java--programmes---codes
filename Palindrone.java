package Tushar.com;

import java.util.Scanner;

public class Palindrone {

	public static void main(String[] args) {
		int n,c,r,sum=0;
		System.out.println("Enter teh number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		c=n;
		while(n>0)
		{
			r=n%10;
			sum =(sum*10)+r;
			n=n/10;
		}
		if(c==sum)
		{
			System.out.println("This is an palindrone number");
		}
		else
			System.out.println("This is not a palindrone number");
	}

}
