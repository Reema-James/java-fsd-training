import java.io.*;
import java.lang.*;
import java.util.*;

class Double
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int s=sc.nextInt();
		String[][] arr=new String[2][s];
		System.out.println("Enter the names and marks of each student:");
		for(i=0; i<2; i++)
		{
			for(j=0; j<s; j++)
			{
				arr[i][j]=sc.next();
			}
			System.out.println("...............................");
		}
		for(i=0; i<2; i++)
		{
			for(j=0; j<s; j++)
			{
				System.out.print(" "+arr[i][j]+ " ");
			}
			System.out.println("");
		}	

		//checking if marks>400

		for(i=1; i<2; i++)
		{
			for(j=0; j<s; j++)
			{
				System.out.println(" " +arr[i][j]+ " ");
				int s1 = Integer.parseInt(arr[i][j]);
				if(s1>400)
				{
					System.out.println(arr[0][j]+ "-passed exam");
				}
				else
				{
					System.out.print(arr[0][j]+ "-failed exam");
				}
			}	
		System.out.println(" ");
	}
}		
}
