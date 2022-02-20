import java.io.*;
import java.lang.*;

class MethodOverL2
{
	static void add(int a, double b)
	{
		System.out.println("a+b");
	}
	
	static void add(int a, int b)
	{
		System.out.println("a+b");
	}

public static void main(String[] args)
	{
		add(16,19);
		add(3,7.5);
	}
}
		
