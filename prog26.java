import java.util.*;
class perfect
{
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the number:");
       int n=scan.nextInt();
       
       int t=0;
       int n1=n;
       for(int m=1;m<=n;m++)
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