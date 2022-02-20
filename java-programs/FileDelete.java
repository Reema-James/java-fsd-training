import java.io.File;

class FileDelete
{
	public static void main(String[] args)
	{
		File f1=new File("D: FileCreateExample.txt");
		if(f1.delete())
		{
			System.out.println(f1.getName()+ "File Deleted");
		}
		else{
			System.out.println("Error occured");
		}
	}
}