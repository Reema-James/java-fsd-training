import java.io.FileReader;
import java.io.IOException;

class SampleRead
{
	public static void main(String[] args) throws IOException
	{
		int x;
		  FileReader fr=new FileReader("D:Methods.txt");        
          while((x=fr.read())!=-1)    
          System.out.print((char)x);    
          fr.close();    
	}

}
