//Nested try-catch for nullpointerexception and numberformatexception.

class NullPtr
{
	public static void main(String[] args)
	{
		try
		{
			try
			{
				String s1="History";
				String s2=null;
				System.out.println(s1.compareTo(s2));
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic exception");
			}
			catch(NullPointerException e)
			{
				System.out.println("NullPointer Exception");
			}
			
			String s="helloworld";  
			int i=Integer.parseInt(s);

	}//outer try closes

		catch(NumberFormatException e)
		{
			System.out.println("Number format exception");
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Exception");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	}
