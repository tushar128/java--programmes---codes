package Tushar.com;

public class Secondminimum {

    public static void main(String[] args) {
        // Find the second minimum elements
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int first = a[0];
      //  int second = Integer.MAX_VALUE;
        int  second  = a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < first) {
                second = first;
                first = a[i];
            } //else if (a[i] < second && a[i] != first)
            {
                second = a[i];
            }
        }

        System.out.println("The first smallest element is: " + first);
        System.out.println("The second smallest element is: " + second);
    }
}
