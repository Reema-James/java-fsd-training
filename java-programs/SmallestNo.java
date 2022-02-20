//b) Write a program to use a Ternary operator and find the smallest of three numbers.

import java.io.*;
import java.util.Scanner;
class SmallestNo
{
	static int a,b,c;
	public static void main(String[] args)
		{
//Initialise variables
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter first number");
			a=sc.nextInt();
			System.out.println("Please enter second number");
			b=sc.nextInt();
			System.out.println("Please enter third number");
			c=sc.nextInt();
			int smallest;

//Finding greatest and printing output
		
			smallest=(a<b)?(a<c?a:c):(b<c?b:c);
		System.out.println("The greatest of three numbers is:" +smallest);
		}
}