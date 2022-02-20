//4. check occurence of a particulare character

import java.io.*;
import java.lang.*;
import java.util.*;

class CharOcc
{

	 public static int count(String str, char ch)
    {
        int res = 0;
 
        for (int i=0; i<str.length(); i++)
        {
            if (str.charAt(i) == ch)
            res++;
        }
        return res;
    }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		System.out.println("Enter a character to check occurence:");
		char ch=sc.next().charAt(0);
		int occ = 0;
		 System.out.println(count(str, ch));
		}
	}
 
