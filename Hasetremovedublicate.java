package Tushar.com;

import java.util.HashSet;

public class Hasetremovedublicate {

	public static void main(String[] args) {
		// remove dublicate elemnts from array through hasset
		int a[]= {1,1,2,2,3,4,5};
		HashSet <Integer> hs = new HashSet<Integer>();
		 for (int i = 0; i < a.length; i++)
		{
			hs.add(a[i]);
		}
		System.out.println(" "+hs);
	}

}
