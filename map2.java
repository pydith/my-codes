import java.util.*;
public class map2 {
    public static void main(String args[])
    {
      Map<Integer,String>n=new HashMap<>();
      //Map<Integer,String>n1=new LinkedHashMap<>();
      //Map<Integer,String>n2=new TreeMap<>();
      n.put(1,"demo");
      n.put(2,"demo1");
      n.put(3,"demo3");
      System.out.println(n);
      Map<Integer,String>n1=new HashMap<>();
      n1.put(4,"demo");
      n1.put(5,"dem");
      n1.put(6,"dmo");
      System.out.println(n1);
      n.putAll(n1);
      System.out.println(n);
      System.out.println(n.remove(2));
      //n.remove(n, n1);
      //System.out.println(n);
      System.out.println(n.keySet());
      System.out.println(n.values());
      System.out.println(n.entrySet());
      n.clear();
      System.out.println(n);




    }
    
}
