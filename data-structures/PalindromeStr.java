import java.io.*;
import java.util.*;
 
class PalindromeStr
{
        public static int palindrome_check(char [] s, int start, int end)
        {
            if(start==end || (end-start==1))
            {
                return 1;
            }
            else
            {
                if(s[start]==s[end])
                {
                    return palindrome_check(s,start+1,end-1);
                }
                else
                {
                    return 0;
                }
            }
        }
  public static void main(String[] args) 
  { 
    Scanner sr = new Scanner(System.in); 
    System.out.println("enter the string to check");
    String s = sr.next();
    char a[] = s.toCharArray();
    int n = s.length();
    if(palindrome_check(a,0,n-1)==1)
        {
         System.out.println("It is a palindrome");
        }
        else
         {
        System.out.println("It is not a palindrome");
        }
  } 

}