//stringindexoutofboundsexception

class StringInd
{
	public static void main(String[] args)
	{
		try
		{
			String s="Hello World";
			System.out.println(s.charAt(40));
		}

		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}		