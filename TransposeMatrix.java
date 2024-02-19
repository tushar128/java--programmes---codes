package Tushar.com;

import java.util.Scanner;

public class TransposeMatrix {

    public static void main(String[] args) {
        // Input matrix dimensions
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        n = sc.nextInt();
        System.out.println("Enter the number of columns:");
        m = sc.nextInt();
        int ma[][] = new int[n][m];
        int tr[][] = new int[m][n]; // Transposed matrix

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

        // Transpose the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                tr[i][j] = ma[j][i];
            }
        }

        // Display transposed matrix
        System.out.println("Display the transpose matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(tr[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
