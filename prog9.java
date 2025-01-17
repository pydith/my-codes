class key
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int add(int a)
    {
        return a;
    }
  public static void main(String args[])
  {
    key obj=new key();
    int r=obj.add(10);
    System.out.println("the addition is:" +r);

   
   
  }
}