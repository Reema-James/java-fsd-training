//4.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
//Ask user for their salary and year of service and print the net bonus amount. 
//Note- create a method EmployeeBonus to calculate the bonus and return it.


import java.io.*;
import java.util.Scanner;

class Bonus
{
	public static double EmployeeBonus(double sal)
	{
		double bonus=sal*5/100;
		return bonus;
	}
	public static void main(String[] args)
	{
 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the salary: ");
      double sal= sc.nextDouble();
      System.out.println("Enter the years of service: ");
      int num= sc.nextInt();
      double netamt=EmployeeBonus(sal);

      if(num>5)
      {
      	System.out.println("Net bonus amount:"+netamt);
      }
      else
      {
      	System.out.print("Not eligible for bonus");
      }
  }
  }

      
