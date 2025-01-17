import java.util.*;  
public class collection1 {
    public static void main(String args[])
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("mango");
        System.out.println("the list is:"+fruits);
        fruits.add(1,"papaya");
        System.out.println("the updated list"+fruits);
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("pineapple");
        fruits.addAll(fruit);
         System.out.println(fruits);
        String s=fruits.get(2);
        System.out.println(s);
        int n=fruits.size();
        System.out.println(n);
        String a=fruit.remove(1);
        System.out.println(a);
         fruits.removeAll(fruit);
         System.out.println(fruits);

         fruit.add("apple");
         fruits.retainAll(fruit);
         System.out.println(fruits);
         fruits.clear();
         
         System.out.println(fruits);

    }
}
// import java.util.*;
// class demo{
//     public static void main(String args[])
//     {
//         ArrayList<Integer> in=new ArrayList<>();
//         in.add(10);
//         in.add(20);
//         in.add(30);
//         System.out.println(in);
//         in.add(1,50);
//         System.out.println(in);
//         System.out.println(in.size());
        
//     }
// }