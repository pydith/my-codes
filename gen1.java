import java.util.List;
import java.util.LinkedList;
public class gen1 {
    public static void main(String args[])
    {List l1 = new LinkedList<>();
        l1.add("String");
        l1.add(100);
        l1.add(2.345);
        System.out.println(l1);
        l1.add(1,"durga");
        List l2 = new LinkedList<>();
        l2.add("tring");
        l2.add(100);
        l2.add(2.45);
        System.out.println(l2);
        l1.addAll(l2);
        System.out.println(l1);
        System.out.println(l1.get(2));
        System.out.println(l1.size());
        System.out.println(l1.remove(3));
        l1.removeAll(l2);
        System.out.println(l1);
        l1.add(2.45);
        l1.retainAll(l2);
        System.out.println(l1);
        l1.clear();
        System.out.println(l1);
        

    
    
    }
}
