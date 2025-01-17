import java.util.*;
class digit
{
    public static void main(String args[])
    {int temp=0, num=5467;
        while(num>0)
        {
            int sum=num%10;
            if(sum>=temp)
            {
                temp=sum;
            }
            num=num/10;
        }
        System.out.println("the largest number is:" +temp);
        

    }
}