//1.Write a program that prompts the user to input a positive integer. 
//It should then output a message indicating whether the number is a prime number.

import java.io.*;
import java.util.Scanner;

class PrimeNo
{
	public static void main(String[] args)
	{
		 int a, i, count=0;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter a Positive Integer: ");
      a = s.nextInt();
      
       
      for(i=2; i<a; i++)
      {
         if(a%i == 0)
         {
            count++;
            break;
         }
      }
      
      if(count==0)
      {
         System.out.println("It is a Prime Number");
      }
      else
      {
         System.out.println("It is not a Prime Number");
      }

	}

}