import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Iterator;
public class file4 {
    public static void main(String args[])
    {
        LinkedHashSet<String> link= new LinkedHashSet<>();
        link.add("cow");
        link.add("cat");
        link.add("dog");
        link.add("snake");
        //System.out.println(link);
        Iterator<String> iterator=link.iterator();
         while(iterator.hasNext())
         {
            System.out.println(iterator.next());
         }    
    
        LinkedHashSet<String> link1= new LinkedHashSet<>();
        link1.add("lion");
        link1.add("tiger");
        link1.add("cheetha");
        link1.add("boar");
        //System.out.println(link1);
        Iterator<String> iterator2=link1.iterator();
         while(iterator2.hasNext())
         {
            System.out.println(iterator2.next());
         } 
        link.addAll(link1);
        System.out.println(link);
        System.out.println(link.size());
        System.out.println(link.removeAll(link1));
        System.out.println(link);
        link1.add("cow");
        System.out.println(link.retainAll(link1));
        System.out.println(link);
        link.clear();
        System.out.println(link);

    }
    
}
