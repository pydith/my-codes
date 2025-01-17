import java.util.*;
class division
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scan.nextInt();
        if(num%3==0 && num%5==0)
        { 
            System.out.println("it is divisible by both" +num);
        }else{
            System.out.println("it is not divisible");
        }
    }
}