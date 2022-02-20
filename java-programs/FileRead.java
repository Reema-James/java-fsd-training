import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

class FileRead
{
	public static void main(String[] args)
	{
		try{
			File f1=new File("D: FileCreateExample.txt");
			Scanner sc=new Scanner(f1);
			while(sc.hasNextLine())
			{
				String fileData=sc.nextLine();
				System.out.println(fileData);
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error occured");
			System.out.println(e);
		}
	}
}