package Tushar.com;

public class MinMAx {

	public static void main(String[] args) {
		// Find the Mininimum & Maximum value in it  
				int a[]= {1,2,3,4,5,6,7,8,9,10}, max;
				
		max =a[0];
	
		for (int i = 0; i < a.length; i++)
		{
			if(max < a[i])
			{
			max= a[i];
		}
		}
		System.out.println("This is an Largest  elemnets elements in it " +max+ " ");
		
		int min = a[0];
		for (int i = 0; i < a.length; i++)
		{
			if(min > a[i])
			{
			min = a[i];
		}
		}
		System.out.println("This is an Smalest  elemnets elements in it " +min+ " ");
			}
	}


