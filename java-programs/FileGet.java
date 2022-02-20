import java.io.File;

class FileGet
{
	public static void main(String[] args)
	{
		File f1=new File("D: FileCreateExample.txt");
		if(f1.exists())
		{
			System.out.println("File named" +f1.getName());
			System.out.println("Is the file writeable:" +f1.canWrite());
			System.out.println("The absolute path of file is:" +f1.getAbsolutePath());
			System.out.println("Is the file readable:" +f1.canRead());
			System.out.println("The size of file in bytes:" +f1.length());
		}
		else{
			System.out.println("File does not exist.");
		}
	}
}