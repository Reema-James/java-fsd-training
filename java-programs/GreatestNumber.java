import java.io.*;
import java.util.Scanner;
class GreatestNumber
{
	static int a,b;
	public static void main(String[] args)
		{
//Initialise variables
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter first number");
			a=sc.nextInt();
			System.out.println("Please enter second number");
			b=sc.nextInt();

//Finding greatest and printing output
		
			if(a>b)
				{
				System.out.println("greatest:" +a);
				}
			else
				{
				System.out.println("greatest:" +b);
				}
		}
}