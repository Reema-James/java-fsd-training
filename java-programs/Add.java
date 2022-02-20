import java.io.*;
import java.lang.*;
import java.util.*;

class Add
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		String[] arr=new String[size];
		int [] arr1 = new int [size];
		int sum=0;
		System.out.println("Enter the elements of string array:");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.next();
		}
		System.out.println("The string array is:");
		for(int i=0; i<size; i++)
		{
			System.out.print(arr[i]+ ",");
		}
		System.out.print("The integer array:");
      for(int i=0; i<size; i++) 
      {
         arr1[i] = Integer.parseInt(arr[i]);
      }
      System.out.println(Arrays.toString(arr));

      //addition

      for(int i=0; i<size; i++)
      {
      	sum+=arr1[i];
      }
      System.out.println("Sum of ineteger array elements:" +sum);
  }
}


