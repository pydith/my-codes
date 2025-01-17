import java.util.*;
class square
{
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter the number to find squares:");
        int i=n.nextInt();
        for(int j=1;j<=i;j++)
        {
            int sum=j*j;
            System.out.println("the square is:" +sum);
        }
    }
}