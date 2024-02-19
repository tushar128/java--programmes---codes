package Tushar.com;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		//sparse marix
		 int n, m , count =0;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of rows:");
	        n = sc.nextInt();
	        System.out.println("Enter the number of columns:");
	        m = sc.nextInt(); // Corrected from n to m for number of columns
	        int ma[][] = new int[n][m]; // Corrected from n to m for number of columns

	        // Input matrix elements
	        System.out.println("Enter the elements of the matrix:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                ma[i][j] = sc.nextInt();
	            }
	        }

	        // Display original matrix
	        System.out.println("Display the original matrix:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                System.out.print(ma[i][j] + " ");
	            }
	            System.out.println(); // Move to the next row
	        }

	        // Sparse   matrix
	        System.out.println("Display the sparse matrix:");
	        for (int i = 0; i < n; i++) {
	        	for (int j = 0; j < m; j++) { 
	               if(ma[i][j]==0 )
	               {
	            	  count ++; 
	               }
	            }
	        	
	            System.out.println(); // Move to the next row
	        }
	        if (count > (n * m) / 2)
	        {
	        System.out.println("sparse matrix " + count + " zeros");	
	        }
	        else
	        	 System.out.println("Dense  matrix " + count + " zeros");	
	}

}
