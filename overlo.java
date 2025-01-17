public class overlo {
    static int add(int a,int b)
    {
        return a+b;
    }
    static int add(int a,int b,int c)
    {
        return a+b+c;
    }
    
}
class method
{
    public static void main(String[] args) {
        overlo l=new overlo();
        System.out.println(l.add(10, 20));
        System.out.println(l.add(10, 20, 30));
        }
}