import java.util.Scanner;
public class practice {
  public static void main(String args[])
  {
    int count=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number:");
    int n=scan.nextInt();
    if(n>0&&n<10)
    {
      count=count+(n*n);
      if(count==1)
      {
        System.out.println("its a happy number");
      }
    }
    else if(n>10&&n<100)
    {
        System.out.println("happy");
    }
  }
    
}
