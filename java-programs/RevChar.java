import java.io.*;
import java.lang.*;
import java.util.*;

class RevChar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		int n=str.length();
		char[] ch=new char[n];
		char[] arr=new char[n];
		for(int i=0; i<n; i++)
			{
				ch[i]=str.charAt(i);
			}
			System.out.println("Character array:");
			for(int i=0; i<n; i++)
			{
				System.out.println(ch[i]);
			}
			int temp=n-1;
			for(int i=0; i<n; i++)
			{
				arr[temp]=ch[i];
				temp=temp-1;
			}
			System.out.println("The reverse character array:");
			for(int i=0; i<n; i++)
			{
				System.out.println(arr[i]);

			}
			System.out.println("");
			String s1= String.valueOf(arr);
			System.out.println("reverse string:" +s1);
			
		}

    }
