class key
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public double sub(double a,double b)
    {
        return a-b;
    }
    public float mul(float a,float b)
    {
        return a*b;
    }
  public static void main(String args[])
  {
    key obj=new key();
    int r=obj.add(10,20);
    System.out.println("the addition is:" +r);

    double m=obj.sub(20,10);
    System.out.println("the subtraction is:" +m);

   float t=obj.mul(10,20);
    System.out.println("the multiplication is:" +t);

   
  }
}