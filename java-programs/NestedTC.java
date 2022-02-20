class NestedTC
{
	public static void main(String[] args)
	{


		try
		{//outer try
			try//inner try
			{
				System.out.println("we are going to divide by 0");
				int b=50/0;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("array index out of bounds");
			}
			catch(ArithmeticException e)
			{
				System.out.println("arithmetic exception");
			}

			int[] arr=new int[5];
			arr[7]=65;
			
		}//outer try closes
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bounds");
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}


}