//1.Write Two program to implement Method overloading in different ways.Create atleast 4 methods in one program through which method overloading can be implemented.

import java.io.*;
import java.lang.*;

class MethodOverLoading2
{
	static void add(int a, double b)
	{
		System.out.println("a+b");
	}
	
	static void add(int c, int d)
	{
		System.out.println("c+d");
	}

	static void add(double e, double f)
	{
		System.out.println("e+f");
	}

	static void add(float g, int h)
	{
		System.out.println("g+h");
	}

public static void main(String[] args)
	{
		add(16,19);
		add(3,7.5);
		add(234.5,125.10);
		add(35.5f,45);
	}
}