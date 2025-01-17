// public class lastadd {
//     public static void main(String args[])
//     {
//         int num=2345655;
//         String s=Integer.toString(num);
//         int n=Character.getNumericValue(s.charAt(0));
//         int m=Character.getNumericValue(s.charAt(s.length()-1));
//         int k=n+m;
//         System.out.println(k);
      
        
//     }
// }
class firstandlast{
 public static void main(String args[])
 {
    int n=23476;
    int first,last=0,sum=0;
    last=n%10;
    while(n>0)
    {
        
        first=n;
        sum=last+first;
        n=n/10;


    }
    System.out.println("sum of first and last is:"+sum);
 }
}