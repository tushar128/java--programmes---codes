package Tushar.com;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arm =0 , n, r,c;
System.out.println("Enter teh number");
Scanner sc = new Scanner(System.in);
n= sc.nextInt();
c=n;
while(n>0)
{
	r=n%10;
	arm =(r*r*r)+arm;
	n=n/10;
}
if(c== arm)
{
	System.out.println("this is an arm strong number");
}
else
	System.out.println("this is not a arm strong number");
	}

}
