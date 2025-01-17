import java.util.*;
class demo{
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter the year:");
      int year=scan.nextInt();
      System.out.println("the entred year is:" +year);
      if(((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))){
         System.out.println("the entered year is leap year:" +year);
      }else
      {
        System.out.println("it is not a leap year");
      }
    }
}