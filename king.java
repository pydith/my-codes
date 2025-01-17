
/**
 * newinter
 */
//  interface newinter {

//     void print();
// }
/**
 * Innernewinter
 */
// interface inner{
//     void print();
// }
// class nick implements inner
// {
//     public void print()
//     {
//           System.out.println("hello");
//     }
//     public static void main(String args[])
//           {
//             nick n=new nick();
//             n.print();
//           }
// }
/**
 * newinter
 */
// import java.util.Scanner;
// public class king {
//     public static void main(String args[])
//     {
//         Scanner scan=new Scanner(System.in);
//         System.out.println("enter the first String:");
//         String s=scan.nextLine();
//         System.out.println("enter the second String:");
//         String d=scan.nextLine();
//         if(s.equals(d))
//         {
//             System.out.println("boths the Strings are equal");
//         }
//         else{
//             System.out.println("both are not same");
//         }
//     }

    
// }
interface app
{
    void add();
    void sub();
    void multi();
}

 class king implements app{
   public void add();
    void sub();
    public void multi()
    {
       
    }   
}
class imp implements app,king{
    public void  add()
    {
        System.out.println("i am doing addition");
    }
}