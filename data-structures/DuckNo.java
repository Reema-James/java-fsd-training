import java.io.*;   
import java.util.Scanner;  
  
public class DuckNo
{  
    public static void main(String[] args)   
    {     
        int num;   
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter a number");  
        num = sc.nextInt();   
        int r, count=0;
        while(num!=0)
        {
            r=num%10;
            if(r==0)
                count++;
                num=num/10;
        }
        if(count>0)
            System.out.println("It is a duck number");

        else
            System.out.println("It is not a duck number");
    }  
}  