package Tushar.com;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n , r;
System.out.println("Enter the number");
Scanner sc = new Scanner(System.in);
n= sc. nextInt();

while(n>0)
{
	r= n%10;
	System.out.println(" Reverse " + r +  " ");
	n=n/10;
}
	}

}
