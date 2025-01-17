 class inherit3 {
     void eat()
     {
        System.out.println("Eating...");
     }    
}
class dog extends inherit3{
    void eat(){
        System.out.println("Dog is eating...");
    }
}
class cat extends inherit3{
    void eat(){
        System.out.println("Cat is eating...");
        }
}
class sound
{
    public static void main(String[] args) {
        inherit3 obj1 = new dog();
        inherit3 obj2 = new cat();
        obj1.eat();
        obj2.eat();
        }
    }
