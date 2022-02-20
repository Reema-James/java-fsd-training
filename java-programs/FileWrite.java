import java.io.FileWriter;
import java.io.IOException;

class FileWrite
{
	public static void main(String[] args)
	{
		try{
			FileWriter f1=new FileWriter("D: FileCreateExample.txt");
			f1.write("I am writing to this file from a program");
			f1.close();
			System.out.println("Content has been written to this file successfully");
		}
		catch(IOException e)
		{
			System.out.println("Error occured");
			System.out.println(e);
		}
	}
}