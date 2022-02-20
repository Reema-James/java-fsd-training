import java.io.IOException;  
import java.io.*;

public class Throws1
{
  static void checkSum(int sum) throws ArithmeticException 
  {
    int a=5, b=10;
    sum=a+b;
    if (sum < 20) 
    {
      throw new ArithmeticException("Invalid sum - minimum value of sum must be 20");
    }
    else 
    {
      System.out.println("Valid sum");
    }
  }

  public static void main(String[] args) 
  {
   checkSum(15);
  }
}
