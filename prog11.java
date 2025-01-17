class person{
    public String name;
    public int age;

    public person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("name:" +name);
        System.out.println("age:" +age);
    }
}
class main{
    public static void main(String args[])
    {
      person person1=new person("john",30);
      person1.display();
      
    }
}