import java.io.*;
import java.lang.*;
import java.util.*;

class Exmp1
{
	public static void main(String[] args)
	{
		try{
			int a=9, b=3, c=8;
			int avg=(9+3+8)/0;
			System.out.println(avg);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		int avg=(9+3+8)/3;
	}
}	