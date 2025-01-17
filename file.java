import java.util.ArrayList;
import java.util.List;

public class file {
    public static void main(String args[])
    {
       List<Integer> L=new ArrayList<>();
       L.add(12);
       L.add(13);
       L.add(14);
       System.out.println(L);
       L.add(2,54);
       System.out.println(L);
       List<Integer> L1=new ArrayList<>();
       L1.add(1);
       L1.add(3);
       L1.add(4);
       System.out.println(L1);
       L1.addAll(L);
       System.out.println(L1);
       System.out.println(L1.get(4));
       System.out.println(L1.size());
       System.out.println(L1.remove(2));
       L1.add(13);
       L1.removeAll(L);
       System.out.println(L1);
       L.add(3);
       L1.retainAll(L);
       System.out.println(L1);
       System.out.println(L);
       L.clear();
       System.out.println(L);


    }
    
}
