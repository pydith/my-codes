import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;
public class file3 {
    public static void main(String args[])
    {
        List<String> l3=new LinkedList<>();
        l3.add("hiii");
        l3.add("soilder");
        l3.add("welcome");
        l3.add(3, "to");
        l3.add("miracle");
        Iterator<String> iterator = l3.iterator();
            while(iterator.hasNext())
            {
                System.out.println(iterator.next());
            }
            List<String> l4=new LinkedList<>();
            l4.add("king");
            l4.add("soilder");
           l3.addAll(l4);
           Iterator<String>iterator2=l3.iterator();
           while(iterator2.hasNext())
           {
            System.out.println(iterator2.next());
           }
           System.out.println(l3.get(2));
           System.out.println(l3.size());
           System.out.println(l3.remove(3));
           l3.removeAll(l4);
          System.out.println(l3);
          l4.add("welcome");
          l3.retainAll(l4);
          System.out.println(l3);
          l4.clear();
          System.out.println(l4);
           }
         
    }
    


