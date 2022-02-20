//3.Write a java program to implement an abstract class with two abstract methods and one non-abstract method.

import java.io.*;
import java.lang.*;

abstract class Phone
{
	abstract void ring();
	abstract void call();
	void text()
	{
		System.out.println("Texting..");
	}
}

class Galaxy extends Phone
{
	void ring()
	{
		System.out.println("Ringing..");
	}
	void call()
	{
		System.out.println("Calling..");
	}
}

class AbstractOne
{
	public static void main(String[] args)
	{
		Phone p=new Galaxy();
		p.ring();
		p.call();
		p.text();
	}
}
