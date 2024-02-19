package Tushar.com;

import java.util.Scanner;

public class Mirrormatrix {

    public static void main(String[] args) {
        // Mirror Matrix
        int n, m;
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

        // Display mirror matrix
        System.out.println("Display the mirror matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) { // Changed n to m for the number of columns
                System.out.print(ma[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
