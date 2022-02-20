import java.util.*;
class SumOf2Arr
{
    public static void main(String[] args)
    {
        int i, j;
        System.out.print("Enter the number of rows and columns");
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        int[][] arr1=new int[rows][cols];
        int[][] arr2=new int[rows][cols];
        int[][] arr3=new int[rows][cols];
        System.out.println("Enter the array one elements:");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<cols; j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the array two elements");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<cols; j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(i=0; i<rows; i++)
        {
            for(j=0; j<cols; j++)
            {
                arr3[i][j]= arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum of arrays one and two is:");
        for(i=0; i<rows; i++)
        {
            for(j=0; j<cols; j++)
            {
                System.out.print(arr3[i][j]+ " ");
            }
            System.out.println("");
        }

    }
}