import java.util.ArrayList;
import java.util.List;
public class l1 {
    public static void main(String args[])
    {
        List<String> l1=new ArrayList<String>();
        
        l1.add("durga");
        l1.add("giridhar");
        l1.add("surya");
        System.out.println(l1);
        l1.add(1,"satya");
        System.out.println(l1);
        List<String> l2=new ArrayList<String>();
        l2.add("durga");
        l2.add("den");
        l2.add("dog");

        l2.add("dfjf");
        System.out.println(l1.addAll(l2));
        System.out.println(l1);
        System.out.println(l1.get(2));
        System.out.println(l1.size());
        System.out.println(l1.remove(1));
        System.out.println(l1.removeAll(l2));
        l2.add("surya");
        l1.retainAll(l2);
        System.out.println(l1);
        l2.clear();
        System.out.println(l2);
    }

}
