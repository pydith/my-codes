import java.util.*;
class ternary
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number:");
        int a=scan.nextInt();
        System.out.println("the second number:");
        int b=scan.nextInt();
        System.out.println("the third is");
        int c=scan.nextInt();
        int max=Math.max(a,Math.max(b,c));
        System.out.println("the largest is:" +max);
    }
}