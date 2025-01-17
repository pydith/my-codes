import java.util.ArrayList;
import java.util.ListIterator;
public class file2 {
    public static void main(String args[])
    {
      ArrayList<String> s1=new ArrayList<String>();
      s1.add("demo");
      s1.add("demo1");
      s1.add("demo2");
      s1.add("demo3");
      //System.out.println(s1);
      ListIterator<String> listIterator=s1.listIterator();
      while (listIterator.hasNext()) {
        System.out.println(listIterator.next());
      }
      s1.add(2,"demo4");
      System.out.println(s1);
      ArrayList<String> s2=new ArrayList<String>();
      s2.add("dem");
      s2.add("dem1");
      s2.add("dem2");
      s2.add("dem3");
      System.out.println(s2);
      s1.addAll(s2);
      ListIterator<String>listIterator2=s1.listIterator();
      while (listIterator2.hasNext()) {
        System.out.println(listIterator2.next());
      }
      System.out.println(s1.get(5));
      System.out.println(s1.size());
      System.out.println(s1.remove(2));
      System.out.println(s1.removeAll(s2));
      System.out.println(s1);
      s1.add("dem");
      System.out.println(s1.retainAll(s2));
      System.out.println(s1);
      s1.clear();
      System.out.println(s1);

    }
    
}


