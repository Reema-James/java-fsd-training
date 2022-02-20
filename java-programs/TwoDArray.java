//2D ARRAY USING STRING ARRAYS

import java.util.Scanner;

public class TwoDArray
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the row and column of an array"); //ASKING USER FOR NO.OF ROWS AND COLS

		int row = sc.nextInt();       		//ROW AND COL VARIABLES INITIALISED/SCANNED
		int column = sc.nextInt();

		System.out.println("Enter the array elements");   //ASKING USER TO ENTER ARRAY ELEMENTS
		String[][] arr1 = new String[row][column];        //creating a STRING ARRAY with user specified ROW AND COL

		for(int i=0;i<row;i++)  						//Taking index values for the string array elements
		{
			for(int j=0;j<column;j++)
			 {
				arr1[i][j] = sc.next();					//scanning values of array elements
			}
		}

		for(int i=0;i<row;i++) 						//printing the array elements in respective index values of the string array
		{
			for(int j=0;j<column;j++) 

			{
				System.out.print(arr1[i][j]+" , ");  //PRINT STATEMENT
			}
			System.out.println("");     				//
		}
		
		
	}

}
