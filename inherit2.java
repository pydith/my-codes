 class inherit2 {
    public static void add(int a,int b)
    {
         System.out.println(a+b);
    }
}
class demo extends inherit2{
    public static void sub(int a,int b)
    {
        System.out.println(a-b);
    }
}
class demo1 extends demo
{
    public static void mul(int a,int b)
    {
        System.out.println(a*b);
        }
}  
class run {
    public static void main(String[] args) {
        demo1 d=new demo1();
        d.mul(10,20);
        d.add(10, 20);
        d.sub(10, 20);
    }
}
    
    
    
