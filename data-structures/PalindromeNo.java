import java.util.*;
class PalindromeNo

{
    public static int palin(int num)
    {
       int r,sum=0;
       int temp=num;
       while(num>0)
       {
        r=num%10;
        sum=(sum*10)+r;
        num=num/10;
       }

        if(temp==sum)
        {
            return 1;
        }
            return 0;
    }

    public static void main(String[] args)
    {
        int count=0;
        for(int i=1; i<=11; i++)
        {
            int res=palin(i);
            if(res==1)
            {
                System.out.println(i);
                count++;
            }
            if(count==10)
                break;
        }
    }
}