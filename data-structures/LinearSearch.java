import java.util.*;

class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=sc.nextInt();
		System.out.println("Enter the array elements");
		int[] arr=new int[size];
		for(int i=0;i<size; i++)
		{
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the element to be searched:");
		int num=sc.nextInt();
		linearSearch(arr, size, num);
	}

	public static void linearSearch(int[] arr,  int size, int num)
	{
		int count=-1;
		for(int i=0; i<size; i++)
		{
			if(num==arr[i])
			{
				System.out.println("The number:" +num+ "is present in the index" +i);
				count++;
			}
		}
		if(count==-1)
		{
			System.out.println("The number is not present in the array");
		}
	}
}
