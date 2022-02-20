import java.io.*;
import java.lang.*;
import java.util.*;

class Double1
{
	public static void main(String[] args)
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of rows and cols:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		String[][] arr=new String[row][col];
		System.out.println("Enter the names and marks of each student:");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				arr[i][j]=sc.next();
			}
			System.out.println("...............................");
		}
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				System.out.print(" "+arr[i][j]+ " ");
			}
			System.out.println("");
		}	

		//checking if marks>400

		for(i=1; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				//System.out.println(" " +arr[i][j]+ " ");
				int s1 = Integer.parseInt(arr[i][j]);
				if(s1>400)
				{
					System.out.println(arr[0][j]+ "-passed exam");
				}
				else
				{
					System.out.println(arr[0][j]+ "-failed exam");
				}
			}	
		System.out.println(" ");
	}
}		
}
