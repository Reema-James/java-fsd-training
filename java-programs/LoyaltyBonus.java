//Loyalty Bonus

import java.io.*;
import java.util.*;
import java.lang.*;

class LoyaltyBonus
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Name:");
		String name=sc.next();
		System.out.println("Enter Employee Salary:");
		int sal=sc.nextInt();
		System.out.println("Enter Year of Joining:");
		int year=sc.nextInt();
		double bonus;

		//bonus calculation

		if(year<=2017 && sal>30000)
		{
			bonus=(double)(22*sal/100);
			System.out.println("Loyalty Bonus for" +name+ "is:" +bonus);
		}
		else if(year<=2017 && sal<30000)
		{
			bonus=(double)(33*sal/100);
			System.out.println("Loyalty Bonus for" +name+ "is:" +bonus);
		}
		else if(year<=2012)
		{
			bonus=(double)(40*sal/100);
			System.out.println("Loyalty Bonus for" +name+ "is:" +bonus);
		}
		else if(year>2017 && sal<30000)
		{
			bonus=(double)(15*sal/100);
			System.out.println("Loyalty Bonus for" +name+ "is:" +bonus);
		}
		else if(year>2017 && sal>30000)
		{
			bonus=(double)(10*sal/100);
			System.out.println("Loyalty Bonus for" +name+ "is:" +bonus);
		}
		else
		{
			System.out.println("Invalid input");
		}

	}
}