package Tushar.com;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		//Leap year
		int y;
		System.out.println("Entet the leap year");
		Scanner sc = new Scanner(System.in);
		y= sc.nextInt();
		if(y%100==0 && y%400 == 0 || y%100!=0 && y%4==0 )
		{
			System.out.println(" this is an leap year");
		}
		else
			
			System.out.println(" this is not a leap year");
	}
	}


