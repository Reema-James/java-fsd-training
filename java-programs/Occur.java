/*3.Write a program to input an array of integers according to the user , and also take a input of a 
particular integer and find out the occurence of the intger in the array.*/

import java.util.*;
import java.io.*;

class Occur
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

		System.out.println("Enter array element to find occurence:");
		int a=sc.nextInt();
		int count=0;
		for(int i=0; i<size; i++)
		{
			if(a==arr[i])
			{
				 count++;
			}
		}
		System.out.println(count);
	}
}