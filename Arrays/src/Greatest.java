import java.util.*;
public class Greatest
{
	public static void main(String[]args)
	{
	int n,max;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the number of elements in the array:");
	n=sc.nextInt();
	int array[]= new int [n];
	System.out.println("Enter the elements of array:");
	for (int i=0;i<n;i++) 
	{
		array[i]=sc.nextInt();
	}
	 max= array[0];
	 for (int i=0;i<n;i++)
	 {
		 if (max<array[i])
		 {
			 max= array[i];
		 }
	 }
	 System.out.println("Maximum value in array is:" +max);
	}
}
