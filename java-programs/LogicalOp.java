//4. Write a java program to evaluate two statements each using Logical OR and Logical And operator.

import java.io.*;
  
class LogicalOp
{
    public static void main(String[] args)
    {
       
        int a = 30, b = 45, c = 60, d = 23, sum;

  //Evaluation using logical AND

        if ((a < b) && (c == d)) 
        {
            System.out.println("Conditions are true");
        }
        else
        {
            System.out.println("Conditions are false");
        }

//Evaluation using Logical OR
        
        if ((a > b) ||(a+d<c))
        {
        	sum=a+b+c+d;
        	System.out.println("sum of nos:" +sum);
        }
        else
        {
        	System.out.println("Cannot execute");
        }
    }
}