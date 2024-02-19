package Tushar.com;


import java.util.Arrays;

public class secondlargest {

	public static void main(String[] args) {
		// Find a second Largest elements through aray function
		 
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(a);
		
		System.out.println("Sorted array elements:");
        for (int num : a) {
            System.out.println(num + " ");
        }
		
		System.out.println("First largest elements"+a[a.length - 1]);
		System.out.println("Second largest elements"+a[a.length - 2]);
		
		// find the minimum and send minimum elements
		
		System.out.println("Minimum element: " + a[0]);
		 System.out.println("Second minimum element: " + a[1]);
	}

}
