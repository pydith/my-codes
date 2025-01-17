class person{
    public String name;
    public int age;

    public person()
    {
        this.name="unknown";
        this.age=0;
    }
    public void display(){
        System.out.println("name:" +name);
        System.out.println("age:" +age);
    }
}
class main{
    public static void main(String args[])
    {
      person hi=new person();
      
      System.out.println("personal info");
      hi.display();
      System.out.println("the 12 prblm is also same");
    }
}