//2.Write Two program to implement Method overriding.Create Two parent classes with two methods each , which are overridden.

import java.io.*;
import java.lang.*;

class Computer
{
	void program()
	{
		System.out.println("Computer Programming");
	}
}

class Hardware extends Computer
{
	void program()
	{
		System.out.println("Physical Components");
	}
}

class Software extends Computer
{
	void program()
	{
		System.out.println("Collection of Instructions");
	}
}

class Electronics
{
	void circuit()
	{
		System.out.println("Electronic Circuits");
	}
}

class Digital extends Electronics
{
	void circuit()
	{
		System.out.println("Discrete Signals");
	}
}

class Analog extends Electronics
{
	void circuit()
	{
		System.out.println("Variable Signals");
	}
}

class MethodOverRiding2
{
	public static void main(String[] args)
	{	
		Computer c;
		c=new Hardware();
		c.program();
		c=new Software();
		c.program();

		Electronics e;
		e=new Digital();
		e.circuit();
		e=new Analog();
		e.circuit();

		}
}