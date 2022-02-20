//2.Write a java program to implement an interface with two methods.

import java.io.*;
import java.lang.*;

interface Shape
{
	void draw();
	void show();
}

class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Draw Rectangle");
	}
	public void show()
	{
		System.out.println("Show Rectangle");
	}
}

class InterfaceOne
{
	public static void main(String[] args)
	{
		Shape s=new Rectangle();
		s.draw();
		s.show();
	}
}