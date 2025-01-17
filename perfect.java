import java.util.Scanner;
import java.util.*;
class demo2
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the data:");
    String s=scan.nextLine();
    String[] words=s.split(" ");
    for(String d : words)
    {
       for(int i=0;i<d.length();i++)
       {
        char ch=d.charAt(i);
        if(ch>='a'&&ch<='z')
        {
            System.out.println(ch+" is a small letter");
            }
            else if(ch>='A'&&ch<='Z')
            {
                System.out.println(ch+" is a capital letter");
            }
            else
            {
                System.out.println(ch+" is a special character");
                }
                
       }
    }
            
  }
}