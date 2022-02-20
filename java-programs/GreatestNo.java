import java.io.*;
import java.util.Scanner;
class GreatestNo
{
	static int a,b,c;
	public static void main(String[] args)
		{
//Initialise variables
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter first number");
			a=sc.nextInt();
			System.out.println("Please enter second number");
			b=sc.nextInt();
			System.out.println("Please enter third number");
			c=sc.nextInt();
			int greatest;

//Finding greatest and printing output
		
			greatest=(a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println("The greatest of three numbers is:" +greatest);
		}
}