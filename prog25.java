import java.util.*;
class perfect
{
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the number:");
       int n=scan.nextInt();
       int m=1;
       int t=0;
       int n1=n;
       for(m=1;m<=n;m++)
       {
        if(n%m==0)
        {
           t=t+m;
           if(t==n1)
           {
            System.out.println("it is perfect number");
           }

        }

       }
    }
}