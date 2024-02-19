package Tushar.com;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int n , count=0;
		System.out.println("enter the number");
		Scanner sc = new  Scanner(System.in);
		n= sc.nextInt();
		for(int i=1 ; i<=n ;i++)
		{
			if(n%i==0)
			{
				count++;
				
			}
		}
			if(count==2)
			{
				System.out.println(" yes this is a prime number");
			}
			
			else {
				System.out.println("  this is not  a prime number");
			}
		}

	}


