import java.util.Scanner;
public class demo5 {
    
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the input number:");
       
        try{
            int a=scan.nextInt();
            System.out.println((a*a));
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
