package Tushar.com;

import java.util.Scanner;

public class even {

    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in); // Corrected Scanner initialization
        n = sc.nextInt();
        sc.close(); // Closing the Scanner object to avoid resource leak
        
        System.out.println("Even numbers up to " + n + ":");
        for (int i = 0; i <= n; i += 2) { 
            System.out.print(i + " "); // Printing without new line
        }
    }
}
