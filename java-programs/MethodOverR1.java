import java.io.*;
import java.lang.*;

class Bike
{
	void run()
	{
		System.out.println("The bike is running");
	}
}

class Honda extends Bike
{
	void run()
	{
		System.out.println("Honda is running");
	}
}

class MethodOverR1
{
	public static void main(String[] args)
	{
		Bike b=new Honda();     //Honda is running (Upcasting)
		Honda h=new Honda();   //Honda is running
		Bike s=new Bike();    //Bike is running 
		b.run();
		h.run();
		s.run();
		
	}
}