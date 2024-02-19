package Tushar.com;

public class avgarray {

	public static void main(String[] args) {
		// Find the sum of  avg array elements
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int sum=0 , avg=0;
        for (int i = 0; i < a.length; i++) {
        	sum = sum + a[i];
        	avg = sum/a[i] ;
           
	}
        System.out.println("total sum of array "+ sum + " sum of  avg " + avg + " ");

	}

}
