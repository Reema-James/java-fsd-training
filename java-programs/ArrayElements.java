import java.util.*;

class ArrayElements
{
	public static void main(String[] args)
	{
		int[] arr=new int[10];
		System.out.println("Enter the array elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The arrays elements are:");
		for(int i=0; i<10; i++)
		{
			System.out.print(arr[i]+ ",");
		}
	}
}