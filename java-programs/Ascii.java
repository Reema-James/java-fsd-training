import java.io.*;
import java.lang.*;
import java.util.*;

class Ascii
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the array size:");
		int size=sc.nextInt();
		char[] arr=new char[size];
		int[] asc=new int[size];
		System.out.println("Enter the array elements");
		for(i=0; i<size; i++)
		{
			arr[i]=sc.next().charAt(0);
		}

		for(i=0; i<size; i++)
		{
			asc[i]=arr[i];
		}
		System.out.println("the ASCII values are:");
		for(i=0; i<size; i++)
		{
			System.out.println(asc[i]); 
		}
	}
}