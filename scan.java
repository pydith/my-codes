// import java.util.Scanner;
// public class scan {
//     public static void main(String args[])
//     {
//         Scanner scan=new Scanner(System.in);
//         System.out.println("name");
//         String s=scan.nextLine();
//         System.out.println("age");
//         int n=scan.nextInt();
//         System.out.println("status");
//         char s1=scan.();

//     }
// }

import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;
class duplicate
{
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       System.out.println("enter the size");
       int n=scan.nextInt();
       String[] arr=new String[n];
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=scan.nextLine();
       }
       
       for (int j = 0; j < arr.length; j++) {
        for (int k = j + 1; k < arr.length; k++) {
            if (arr[j].equals(arr[k])) {
                

                System.out.println("the duplicate is:"+arr[j]);
                break;
            }
            
        }
    }
    }
}
