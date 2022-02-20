//2.Write a program that prompts the user to input a positive integer. 
//It should then print the multiplication table of that number. 


import java.io.*;
import java.util.Scanner;

class MultiTable
{
	public static void main(String[] args)
	{
		 int num, m, i;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Positive Integer: ");
      num = sc.nextInt();

      for(i=1; i<=10 ; i++)
      {
      	m=num*i;
      	System.out.println(num+ "*" +i+ "=" +m);
      }
  }
}