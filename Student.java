import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Student{
    int id;
    String name=" ";
     Student(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
}

class sample{
    public static void main(String args[])
    {
           List<Student> l1=new ArrayList<Student>();
           Student s =new Student(1,"durga");
           Student s1=new Student(2,"satya");
                l1.add(s);
                l1.add(s1);
          Iterator<Student> i=l1.iterator();
          while(i.hasNext()){
            Student s2=i.next();
            System.out.println(s2.id+" "+s2.name);
          }
    }
}