// import java.util.Scanner;
// public class arm {
//     public static void main(String args[])
//     {
//         int t=0;int r=0;int n1;
//        Scanner scan=new Scanner(System.in);
//        System.out.println("enter an number:");
//        int s=scan.nextInt();
//        n1=s;
//        while(s>0)
//        {
//         t=s%10;
//         r=r*10+t;
//         s=s/10;
//         }
//         if(r==n1)
//         {
//             System.out.println("the number is palndrome");
//         }
//         else{
//             System.out.println("not a palindrome");
//         }
//     }
    
// }

import java.util.Scanner;
public class arm {
    public static void main(String args[])
    {
        int t=0;int r=0;int n1;
       Scanner scan=new Scanner(System.in);
       System.out.println("enter an number:");
       int s=scan.nextInt();
       n1=s;
       while(s>0)
       {
        t=s%10;
        r=r+(t*t*t);
        s=s/10;
        }
        if(r==n1)
        {
            System.out.println("the number is armstrong");
        }
        else{
            System.out.println("not a armstrong");
        }
    }
    
}

