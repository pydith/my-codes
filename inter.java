import java.util.Scanner;
 interface inter {
    abstract void run();
    abstract void walk();
    abstract void jump();
    
}

class demo implements inter{
    Scanner scan=new Scanner(System.in);
    
    public void run()
    {
        System.out.println("i am running");
    }
    public void walk()
    {
       
        String s=scan.nextLine();
        System.out.println("the string u entered is:" +s);
    }
    public void jump()
    {
       
    }
}
class rat{
    public static void main(String args[])
    {
      demo r=new demo();
      
      r.walk();
      
    }
}

