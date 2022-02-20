import java.io.*;
import java.util.Scanner;
class MyJavaProgram
{
	public static void main(String[] args)
	{
		int a,b,sum,difference,product,quotient;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter first number");
		a=sc.nextInt();
		System.out.println("Please enter second number");
		b=sc.nextInt();

//arithmetic operations

		sum=a+b;
		difference=a-b;
		product=a*b;
		quotient=a/b;

//output

		System.out.println("sum:" +sum);
		System.out.println("difference:" +difference);
		System.out.println("product:" +product);
		System.out.println("quotient:" +quotient);
	}

}