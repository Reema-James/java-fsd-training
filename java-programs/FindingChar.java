//2. Chceck whether given characters are present in the string 
import java.io.*;
import java.lang.*;
import java.util.*;

class FindingChar
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		System.out.println("Enter the size of array:");
		int a=sc.nextInt();
		char[] arr=new char[a];
		int i;
		System.out.println("enter the characters to be checked:");
       for(i=0; i<a; i++) 
    	   {
    		   arr[i]= sc.next().charAt(0);
    		   String str1=String.valueOf(arr[i]);
    		   if(str.contains(str1))
    		   {
    		   	System.out.println("The character-" +arr[i]+ "-is present in string-" +str);
    		   }
    		   else{
    		   	System.out.println("The character-" +arr[i]+ "-is not present in string-" +str);
    		   }
      		}
	}
}