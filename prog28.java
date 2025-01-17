import java.util.*;
class arm
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number to check:");
        int n=scan.nextInt();
        int t=0;
        int n1=n;
        while(n>0)
        {
            int r=n%10;
            t=t+(r*r*r);
            n=n/10;
        } 
        if(n1==t)
        {
            System.out.println("it is arm strong number");
        }
    }
}