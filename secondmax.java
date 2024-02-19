package Tushar.com;

public class secondmax {

	public static void main(String[] args) {
		// Find the second  maximum elements
		int a[]= {1,2,3,4,5,6,7,8,9,10}, max;
		
		max =a[0];
		int second = a[0];
		for (int i = 0; i < a.length; i++)
		{
			if(max < a[i])
			{
				second = max;
			max= a[i];
		}
			else if(second < a[i] )
			{
				second = a[i];
			}
		}
		System.out.println("This is an Fist largest elements in it " +max+ " ");
		
		System.out.println("This is an second  largest elements in it " +second+ " ");
			}
	}


