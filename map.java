import java.util.*;
import java.util.Map.Entry;
public class map {
    public static void main(String args[])
    {
        // Map<Integer,String>m=new LinkedHashMap<>();
        HashMap<String,String> m=new HashMap<>();
        //Map<Integer,String>n=new TreeMap<>();
        // m.put(1, "one");
        // m.put(4,"two");
        // m.put(3,"three");
        m.put( "one","one");
        m.put( "Two","one");
        m.put( "Three","one");
        m.put( "Four","one");
        // m.put(null, "durga");
        // Set<Map.Entry<Integer,String>> s=m.entrySet();
        // Iterator i=s.iterator();
        // while (i.hasNext()) {
        //     Map.Entry<Integer,String> m1=(Map.Entry)i.next();
        //     System.out.println(m1.getKey()+" "+m1.getValue());
            
        // }
        // for(Map.Entry<Integer,String> K3:s);
        Set<String> s=m.keySet();
        for(String i:s)
        {
            System.out.println(i+"  "+m.get(i));
        }
    }
    
}
