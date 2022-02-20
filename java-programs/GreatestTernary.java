//1.a) Write a program to use a Ternary operator and find the greatest of three numbers.

import java.io.*;
import java.lang.*;

class GreatestTernary
{
	public static void main(String[] args)
	{
		int a=80, b=45, c=120, greatest;

		greatest=(a>b)?(a>c?a:c):(b>c?b:c);
		
		System.out.println("The greatest of three numbers is:" +greatest);
	}
}