//2.Write a program to input an array of integers according to the users, and find the greatest value of them.

import java.io.*;
import java.util.*;

class GreatestInt
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the array elements:");
		for(int i=0; i<size; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The greatest integer in the array:");
		int max=arr[0];
		for(int i=0; i<size; i++)
		{
				if(arr[i]>max)
				{
					max=arr[i];
				}
		}
		System.out.println(max);
	}
}