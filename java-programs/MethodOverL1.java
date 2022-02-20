import java.io.*;
import java.lang.*;

class MethodOverL1
{
	static void add(int a, int b)
	{
		System.out.println("a+b");
	}
	
	static void add(int a, int b, int c)
	{
		System.out.println("a+b+c");
	}

public static void main(String[] args)
	{
	add(29,45);
	add(100,200,300);
	}

}