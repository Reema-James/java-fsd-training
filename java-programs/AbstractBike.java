abstract class Bike
{
	Bike() //constructor
	{
		System.out.println("constructor is called");
	}
	abstract void run();
	void changeGear()
	{
		System.out.println("gear changed");
	}
}

//creating a child class which inherits abstract class

class Honda extends Bike
{
	void run()
	{
		System.out.println("running safely..");
	}
}

//creating a test class which calls abstract and non-abstract methods

class AbstractBike
{
	public static void main(String[] args)
	{
		Bike obj=new Honda(); 
		obj.run();
		obj.changeGear();
	}
}

//OUTPUT : 
//constructor is called
//running safely..
//gear changed