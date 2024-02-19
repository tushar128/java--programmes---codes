package Tushar.com;

public class Minimumelement {

	public static void main(String[] args) {
		// Find the Largest Elements 
				int a[]= {1,2,3,4,5,6,7,8,9,10}, min;
				
		min =a[0];
		for (int i = 0; i < a.length; i++)
		{
			if(min > a[i])
			{
			min= a[i];
		}
		}
		System.out.println("This is an Minimum elements in it " + min + " ");
	}

}
