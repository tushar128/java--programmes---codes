package Tushar.com;

public class SecondLargestSum {

	public static void main(String[] args) {
		// Find the second  Largest sum
				int a[]= {1,2,3,4,5,6,7,8,9,10}, max;
				
				max =a[0];
				int second = a[0];
				for (int i = 0; i < a.length; i++)
				{
					for (int j = i +1 ; j < a.length; j++) {
		                int sum = a[i] + a[j];
					
					if(max < sum)
					{
						second = max;
					max= sum;
				}
					else if(second < sum  )
					{
						second = sum;
					}
					}
				}
				System.out.println("This is an Fist largest elements in it " +max+ " ");
				
				System.out.println("This is an second  largest elements in it " +second+ " ");

	}

	}
