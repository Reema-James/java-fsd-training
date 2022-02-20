import java.io.*;
import java.lang.*;

class Shape
{
	void draw()
	{
		System.out.println("Draw a shape");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("Circle");
	}
}

class Triangle extends Shape
{
	void draw()
	{
		System.out.println("Triangle");
	}
}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Rectangle");
	}
}

class MethodOverR2
{
	public static void main(String[] args)
	{	
		Shape s;
		s=new Circle();
		s.draw();
		s=new Triangle();
		s.draw();
		s=new Rectangle();
		s.draw();
	}
}
		


