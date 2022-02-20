//2.Write Two program to implement Method overriding.Create Two parent classes with two methods each , which are overridden.

import java.io.*;
import java.lang.*;

class Science
{
	void discover()
	{
		System.out.println("Scientific Discoveries");
	}
	void invent()
	{
		System.out.println("Scientific Inventions");
	}
}

class Chemistry extends Science
{
	void discover()
	{
		System.out.println("Chemical Reactions");
	}
	void invent()
	{
		System.out.println("Laws of Chemistry");
	}
}

//second parent class

class Maths
{
	void equate()
	{
		System.out.println("Mathematic Equations");
	}
	void integrate()
	{
		System.out.println("Performs Integration");
	}
}

class Geometry extends Maths
{
	void equate()
	{
		System.out.println("Study of Shapes");
	}
	void integrate()
	{
		System.out.println("Geometrical integration");
	}
}

class MethodOverRiding1
{
	public static void main(String[] args)
	{
		Science s;
		s=new Chemistry();
		s.discover();
		s.invent();
		

		Maths m;
		m=new Geometry();
		m.equate();
		m.integrate();
		
	}
}