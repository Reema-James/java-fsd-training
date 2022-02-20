/*3.A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user:
Number of classes held
Number of classes attended.
And print:
percentage of class attended
Is student is allowed to sit in exam or not.*/


import java.io.*;
import java.util.Scanner;

class Attendance
{
	public static void main(String[] args)
	{
		 int num1, num2; 
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of classes held: ");
      num1= sc.nextInt();
      System.out.println("Enter the number of classes attended: ");
      num2= sc.nextInt();

      double percentage=(num2*100/num1);

      if(percentage<75)
      {
      	System.out.println("Attendance percentage:" +percentage+ "%");
      	System.out.println("Student not eligible to write exam");
      }
      else
      {
      	System.out.println("Attendance percentage:" +percentage+ "%");
      	System.out.println("Student eligible to write exam");
      }
  }
}


