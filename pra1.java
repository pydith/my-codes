// class den
// {
//     public static void main(String args[])
//     {
//         String s="world";
//         String h="world";
//         int temp=0;
//         for(int i=0;i<=s.length()-1;i++)
//         {
//             if(s.charAt(i)==h.charAt(i))
//             {
//                temp++;
//         }
//         if(temp==s.length()||temp==h.length())
//         {
//             System.out.println("string are equal");
//         }
        
//     }
// }
// }
import java.lang.String;
// class Str{
//     public static void main(String args[])
//     {
//         String s="welcome to the new world";
        
//         String arr[]=s.split("e",4);
//             for(String x:arr){
//                  System.out.println(x);
//             }
           
        
//     }

// }
class demo{
    public static void main(String args[])
    {
        StringBuffer s =new StringBuffer("welcome to the new world");
        s.insert(5,"W");
        System.out.println(s);
}
}