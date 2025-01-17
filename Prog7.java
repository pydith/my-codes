public class Prog7 {
    public int add1(int a,int b){
        return a+b;
    }
}
class Demo extends Prog7{
    public int add(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        Demo d1=new Demo();
        System.out.println(d1.add(20, 20));
        System.out.println(d1.add1(44, 22));
        
        }
    }

