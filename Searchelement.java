package Tushar.com;
import java.util.Scanner;

public class Searchelement {

	public static void main(String[] args) {
		// Search the array lement in it
		int n, item,count=0 ;
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
System.out.println("Enter The item in it");
item =sc.nextInt();
for(int i =0 ;i<a.length ;i++)
{
	if(a[i]== item)
	{
		count++;
	}
}
if(count> 0)
{
	System.out.println(" Item is found "+ count + " Time ");
}
else
	System.out.println(" Item is Not  found");
	}

}
