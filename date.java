// public class date { 
//     public static void main(String[] args) {
//         int year; // integer type variable to store year
        
//         // Create an object of Calendar class
//         java.util.Calendar current = java.util.Calendar.getInstance();
        
//         // Retrieve the current year
//         year = current.get(java.util.Calendar.YEAR);
        
//         // Print the current year
//         System.out.println("Current Year: " + year);
//     }
// }
// class demo{
// public static  void data(int a,int b)
// {
   
//    if(a<=0||b<=0)
//    {
//     throw new ArithmeticException("must be greater than the given value");
//    }else{
//     System.out.println("hello");
//    }
// }
// public static void main(String args[])
// {
//     data(-1,10);
//     System.out.println("data is transmitted success");
// }
// }
// class data{
//     public static void method() throws ArrayIndexOutOfBoundsException
//     {
//         int[] arr={12,2,3,6,453,63,624,256,325};
//         for(int i=8;i<=arr.length;i++)
//         {
//            throw new ArrayIndexOutOfBoundsException("array index out of bounds exception"); 
        
//         }
//     }
//     public static void main(String[] args) {
//         try{method();}
//         finally
//         {
//            System.out.println("hello rest code");
//         }
//     }
// }


// class ex 
// {
//     public static void demo() throws Exception{
//         {
//         try{
//             String s="abcd";
//             int n=Integer.parseInt(s);
            
//         }catch(Exception e)
//         {
//             System.out.println(e);
//         }

//         }
//     }
//     public static void main(String args[])
//     {
//         try{
//         demo();
//         }catch(Exception e)
//         {
//             System.out.println(e);
//         }


//     }
// }
// class dex
// {
//     public static void main(String args[]){
//         try{
//         String s=null;
//         for(int i=0;i<s.length();i++)
//         {
//             System.out.println(s.charAt(i));
//         }
//         }catch(ArithmeticException e)
//         {
//             System.out.println(e);
//         }catch(Exception e)
//         {
//             System.out.println(e);
//         }

//     }
// }
class dat{
    public static void main(String args[])
    {
        
        try{
            int a=100/0;
            System.out.println(a);
            System.out.println("i am in try block");
        }
        finally{
            System.out.println("all the connections are terminated");
        }
    }

}