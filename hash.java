import java.util.HashSet;
import java.util.Set;
public class hash {
    public static void main(String args[])
    {
        HashSet<String> set=new HashSet<String>();
        set.add("set1");
        set.add("set2");
        set.add("set3");
        set.add("set4");
        System.out.println(set);  
        HashSet<String> set1=new HashSet<String>();
        set1.add("set5");
        set1.add("set6");
        set1.add("set7");
        set1.add("set8");
        System.out.println(set1);
        set.addAll(set1);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.removeAll(set1));
        System.out.println(set);
        System.out.println(set.retainAll(set1));
        System.out.println(set);
        set1.clear();
        System.out.println(set1);
        
    }
}
