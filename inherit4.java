class inherit{
    void run2(){
        System.out.println("welcome");
    }
}
class den extends inherit{
    void run(){
        System.out.println("welcome to den");
    }
}
class dog extends inherit{
    void run1(){
        System.out.println("welcome to dog");
    }
}
class cat extends dog{
    void run(){
        System.err.println("welcome to cat");
    }
}
class signal{
    public static void main(String[] args) {
        cat c=new cat();
        c.run();
        c.run1();
        c.run2();
        }
}