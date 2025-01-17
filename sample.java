import java.util.*;
public class sample {
    int id;
    String name;
    int numb;
    sample(int id,String name,int numb)
    {
        this.id=id;
        this.name=name;
        this.numb=numb;
    }
}
class sam
{
    public static void main(String args[])
    {
        List<sample> l=new LinkedList<>();
        sample s=new sample(1,"durga",898);
        sample s1=new sample(2, "satya", 998);
        sample s2=new sample(3,"pydi",990);
        l.add(s);
        l.add(s1);
        l.add(s2);
        Iterator<sample> i1=l.iterator();
        while (i1.hasNext()) {
            sample s3=i1.next();
            System.out.println(s3.id+" "+s3.name+" "+s3.numb);
        }

    }
}
