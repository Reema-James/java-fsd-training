import java.util.*;
class StringBasic
{
	public static void main(String[] args)
	{
		System.out.println("Enter the string size");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the string elements in string format");
		String str[]=new String[size];
		int i;
		for(i=0;i<size;i++)
		{
		str[i]=sc.next();
	}
	System.out.print("String elements in array format are:");
	for(i=0;i<size;i++)
		{
		System.out.print(str[i]+ ",");
}
}
}