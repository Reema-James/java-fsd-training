import java.util.*;
import java.io.*;
import java.lang.*;

class ArraySize
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		double[] avg=new double[size];
		System.out.println("Enter student names and marks for biology, chemistry and physics");
		string[] names=new string[size];
		int[] bio=new int[size];
		int[] chem=new int[size];
		int[] phy=new int[size];
		for(int i=0;i<size;i++)
		{
			names[i]=sc.next();
			bio[i]=sc.nextInt();
			chem[i]=sc.nextInt();
			phy[i]=sc.nextInt();
		}
		for (int i=0; i<size; i++)
		{
			avg[i]=(double)(bio[i]+chem[i]+phy[i])/3;
		}
		System.out.println("The average mark for science:");
		for(int i=0;i<size;i++)
		{
			System.out.println(names[i]+ "Science marks:" +avg[i]);
		}
	}
}		

