import java.util.*;
public class map3 {
    public static void  main(String args[])
    {
       Map<String,Integer> m1=new LinkedHashMap<>();
       m1.put("durga", 5415);
       m1.put("sai", 1000);
       m1.put("prasad",1234);
       System.out.println(m1);
       Map<String,Integer> m2=new LinkedHashMap<>();
       m2.put("durga", 5429);
       m2.put("bhargav", 1235);
       m2.put("anand",2425);
       System.out.println(m2);
       m1.putAll(m2);
       //System.out.println(m1);
       m1.remove("anand");
       System.out.println(m1);
       Set s=m1.entrySet();
       for(Map.Entry m4:m1.entrySet())
       {
           System.out.println(m4.);
       }
       

    }
}
