/*4.Write a program to input a String array and display it, and now to copy the 
elements into another array in the reverse order and print the reverse_array elements.*/

import java.io.*;
import java.util.*;

class Reverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Size:");
		int size=sc.nextInt();
		String[] arr=new String[size];
		String[] arr1=new String[size];
		System.out.println("Enter the Array Elements:");
		for (int i=0; i<size; i++)
		{
			arr[i]=sc.next();
		}
          
        System.out.println("String Array: ");  
        for (int i=0; i<size; i++) 

        {   
            System.out.println(arr[i] + " ");   
        }    
          
          int temp=size-1;
          for(int i=0; i<size; i++)
          {
          	arr1[temp]=arr[i];
          	temp=temp-1;
          }
         
        System.out.println("Array in reverse order: ");   
        for (int i = 0; i<size; i++) 
        {   
            System.out.print(arr[i] + " ");   
        }    
	}
}