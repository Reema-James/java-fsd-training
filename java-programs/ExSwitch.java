import java.io.*;
import java.lang.*;
import java.util.Scanner;

class ExSwitch
{
	public static void main(String[] args)
	{
		System.out.println("please enter a number");
		System.out.println("1.Monday, 2.Tuesday, 3.Wednesday, 4.Thursday, 5.Friday");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();

		//SWITCH STATEMENT

		switch(a)
		{
		case 1:	System.out.println("Today is Monday");
				System.out.println("Please select your slot");
				System.out.println("1.10am, 2.11am, 3.12pm");
				b=sc.nextInt();
			switch(b)
			{
			case 1:	System.out.println("Your application is booked for 10am");
				break;
			case 2:	System.out.println("Your application is booked for 11am");
				break;
			case 3: System.out.println("Your application is booked for 12pm");
				break;
			default: System.out.println("Invalid input");
			break;
			}
		case 2: System.out.println("Today is Tuesday");
				System.out.println("Please select your slot");
				System.out.println("1.10am, 2.11am, 3.12pm");
				b=sc.nextInt();
			switch(b)
			{
			case 1:	System.out.println("Your application is booked for 10am");
				break;
			case 2:	System.out.println("Your application is booked for 11am");
				break;
			case 3: System.out.println("Your application is booked for 12pm");
				break;
			default: System.out.println("Invalid input");
				break;
			}
		Case 3: System.out.println("Today is Wednesday");
				System.out.println("Please select your slot");
				System.out.println("1.10am, 2.11am, 3.12pm");
				b=sc.nextInt();
			switch(b)
			{
			case 1:	System.out.println("Your application is booked for 10am");
				break;
			case 2:	System.out.println("Your application is booked for 11am");
				break;
			case 3: System.out.println("Your application is booked for 12pm");
				break;
			default: System.out.println("Invalid input");
				break;
			}
		Case 4: System.out.println("Today is Thursday");
				System.out.println("Please select your slot");
				System.out.println("1.10am, 2.11am, 3.12pm");
				b=sc.nextInt();
			switch(b)
			{
			case 1:	System.out.println("Your application is booked for 10am");
				break;
			case 2:	System.out.println("Your application is booked for 11am");
				break;
			case 3: System.out.println("Your application is booked for 12pm");
				break;
			default: System.out.println("Invalid input");
				break;
			}
		Case 5: System.out.println("Today is Friday");
				System.out.println("Please select your slot");
				System.out.println("1.10am, 2.11am, 3.12pm");
				b=sc.nextInt();
			switch(b)
			{
			case 1:	System.out.println("Your application is booked for 10am");
				break;
			case 2:	System.out.println("Your application is booked for 11am");
				break;
			case 3: System.out.println("Your application is booked for 12pm");
				break;
			default: System.out.println("Invalid input");
				break;
			}
		default: System.out.println("Invalid");
			break;

		}
	}
}