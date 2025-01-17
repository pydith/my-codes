public class ride {
    static int add(int a,int b)
    {
        return a+b;
    }
    
}
class demo1 extends ride{
    static int add(int a,int b,int c)
    {
       return a*b*c;
    }
}
class demo2 extends ride{
    static int add(int a,int b)
    {
        return a-b;
    }
}
 class den{
    public static void main(String[] args) {
       demo1 d=new demo1();
        System.out.println(d.add(10,20,30));
    }
}
    
    
