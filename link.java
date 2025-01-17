import java.util.LinkedHashSet;
import java.util.Set;
public class link {
    public static void main(String args[])
    {
        LinkedHashSet<String> link= new LinkedHashSet<String>();
        link.add("cow");
        link.add("cat");
        link.add("dog");
        link.add("snake");
        System.out.println(link);
        LinkedHashSet<String> link1= new LinkedHashSet<String>();
        link1.add("lion");
        link1.add("tiger");
        link1.add("cheetha");
        link1.add("boar");
        System.out.println(link1);
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
