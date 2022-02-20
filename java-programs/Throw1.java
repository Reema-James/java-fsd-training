class Throw1
{
	public static void main(String[] args)
	{
		try
		{
			int a=5,b=4,sum=0;
			sum=a+b;
			if(sum<20)
			{
				throw new ArithmeticException();
			}
			System.out.println("The sum of two numbers is:" +sum);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Sum should be greater than 20");
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}

	}
}	