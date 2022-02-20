//1.Write Two program to implement Method overloading in different ways.Create atleast 4 methods in one program through which method overloading can be implemented.

import java.io.*;
import java.lang.*;
class MethodOverLoading1
{
	static void add(int a, int b)
	{
		System.out.println("a+b");
	}
	
	static void add(int a, int b, int c)
	{
		System.out.println("a+b+c");
	}
	static void add(int a, int b, int c, int d)
	{
		System.out.println("a+b+c+d");
	}
	static void add(int a, int b, int c, int d, int e)
	{
		System.out.println("a+b+c+d+e");
	}

public static void main(String[] args)
	{
	add(2,4);
	add(3,6,9);
	add(4,8,12,16);
	add(5,10,15,20,25);
	}

}