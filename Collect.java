import java.io.IOException;
import java.util.*;

public class Collect {
    public static void main(String[] args) throws Exception {
        double n=System.in.read();
        System.out.println(n);
        Set<String> hashset=new HashSet<String>();
        Set<String> link=new LinkedHashSet<String>();
        Set<String>t1=new TreeSet<String>();
        hashset.add("durga");
        hashset.add("prasad");
        hashset.add("pydithalli");
        hashset.remove("durga");
        hashset.removeAll(hashset);
        t1.addAll(hashset);
        t1.add("sairam");
        t1.add("durga");
        link.add("satyavathi");
        System.out.println(hashset.isEmpty());
        System.out.println(hashset.containsAll(link));

        Iterator<String> i=t1.iterator();
            while(i.hasNext())
            {
               System.out.println(i.next());
               
            }
        
            
        
    }
}

