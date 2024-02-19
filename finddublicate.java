package Tushar.com;

public class finddublicate {

	public static void main(String[] args) {
		// Find a dublicate elemenets
		int a[] = {1, 2, 2, 4, 5, 6, 5, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    System.out.println("Duplicate element: " + a[i]);
                  
                }
            }
        }
	}

}
