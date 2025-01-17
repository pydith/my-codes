import java.util.*;
class prime
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=scan.nextInt();
        int m=10;
        for(int i=m;i<=n;i++)
        {   
            int count=0;
            for(int j=1;j<=n;j++)
            {
              if(i%j==0)
              {
                count++;
              }
            }
            if(count==2){
            System.out.println(+i+ "it is prime number");}   
        }
    }
}
