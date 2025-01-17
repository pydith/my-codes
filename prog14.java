class disp
{   
   private int number;
    private double amount;
    private String name;
    private boolean isActive;
   public disp(int number,double amount,String name,boolean isActive){
    this.number = number;
        this.amount = amount;
        this.name = name;
        this.isActive = isActive;
   }
 public void display(){
    System.out.println("Example Information:");
        System.out.println("Number: " + number);
        System.out.println("Amount: " + amount);
        System.out.println("Name: " + name);
        System.out.println("Active: " + isActive);
 
  }
 public int getnumber(){
    return number;
  }
 public int getNumber() {
    return number;
 }

 public void setNumber(int number) {
    this.number = number;
 }

    public double getAmount() {
    return amount;
 }

 public void setAmount(double amount) {
    this.amount = amount;
 }

 public String getName() {
    return name;
 }

 public void setName(String name) {
    this.name = name;
 }

 public boolean isActive() {
    return isActive;
 } 

 public void setActive(boolean active) {
    isActive = active;
 }
 
}
class dog
{
    public static void main(String args[]){
        disp obj = new disp(123, 456.78, "John Doe", true);
        obj.setNumber(456);
        obj.setAmount(789.12);
        obj.setName("Jane Smith");
        obj.setActive(false);

        System.out.println("After modification:");
        obj.display();
    }
} 
