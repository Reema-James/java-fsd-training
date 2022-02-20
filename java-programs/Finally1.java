//1.Write a Program to implement Finally block along with try and catch block.

class StringInd
{
	public static void main(String[] args)
	{
		try
		{
			String s="Hello World";
			System.out.println(s.charAt(40));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
		finally{
			System.out.println("Hello world");
		}
	}
}		