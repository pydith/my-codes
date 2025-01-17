import java.util.LinkedList;
import java.util.List;
public class l2 {
    public static void main(String args[])
    {
        List<Integer> n1=new LinkedList<>();
        n1.add(19);
        n1.add(20);
        n1.add(21);
        System.out.println(n1);
        n1.add(3,22);
        System.out.println(n1);
        List<Integer> n2=new LinkedList<>();
        n2.add(12);
        n2.add(13);
        n2.add(14);
        System.out.println(n2);
        System.out.println(n1.addAll(n2));
        System.out.println(n1);
        System.out.println(n1.get(2));
        System.out.println(n1.size());
        n1.remove(3);
        System.out.println(n1);
        n1.add(12);
        System.out.println(n1);
        n1.removeAll(n2);
        System.out.println(n1);
        n2.add(19);
        System.out.println(n2);
        n1.retainAll(n2);
        System.out.println(n1);
        n2.clear();
        System.out.println(n2);
    }
    
}
