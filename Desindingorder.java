package Tushar.com;

import java.util.Scanner;

public class Desindingorder {

	public static void main(String[] args) {
		//Print the array in Dessending order
		int n, temp ;
		System.out.println("Enter the  size of aray element");
		Scanner sc = new Scanner(System. in);
		n= sc.nextInt();
		int a[] = new  int[n];
System.out.println("Enter the aray element");
for(int i =0 ;i<a.length ;i++)
{
	
	a[i] = sc.nextInt();
}
System.out.println("Print the aray element");
for(int i =0 ;i<a.length ;i++)
{
	System.out.println(" "+ a[i]);
}
for(int i =0 ;i<a.length ;i++)
{
	for(int j =i +1 ;j<a.length ;j++)
	{
		if(a[i]<a[j])
		{
			temp = a[i];
            a[i] = a[j];
            a[j] = temp;			}
	}
}

System.out.println("Print the aray Elements in Dessending Order ");

for(int i =0 ;i<a.length ;i++)
{
	System.out.println(" "+ a[i]+ " ");
}
	}

}
