package Tushar.com;

import java.util.Scanner;

public class Sumof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0, r,n;
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
while(n>0)
{
	r= n%10;
	sum = (sum+r);
	n=n/10;
}
System.out.println(" Sum of digit " + sum + " ");
	}

}
