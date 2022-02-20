import java.util.*;

public class StrongNo
	{
		public static void main(String[] args) 
		{
			int n, i, fact, enddig;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : " );
			n = sc.nextInt();
			int sum = 0;
			int temp = n;
			while(n != 0)
				{
					i = 1;
					fact = 1;
					enddig = n % 10;
					while(i <= enddig)
						{
						fact = fact * i;
						i++;
						}
					sum = sum + fact;
					n = n / 10;
				}
			if(sum == temp)
			System.out.println(temp + " is a strong number");
			else
			System.out.println(temp + " is not a strong number");
			System.out.println();
		}
	}