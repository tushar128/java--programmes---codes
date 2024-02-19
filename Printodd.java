package Tushar.com;

import java.util.Scanner;

public class Printodd {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in); // Corrected Scanner initialization
        n = sc.nextInt();
        sc.close(); // Closing the Scanner object to avoid resource leak
        
        System.out.println("Odd numbers up to " + n + ":");
        for (int i = 1; i <= n; i += 2) { // Changed loop increment to +=2 to print only odd numbers
            System.out.print(i + " "); // Printing without new line
        }
    }
}
