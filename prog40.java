class happy
{
       public static void main(String args[])
       {
        int number=04;
        if(run(number))
        {
            System.out.println("it is a happy number");
        }else
        {
            System.out.println("it is not a happy number");
        }
       }
       public static boolean run(int n)
       {
          int slow=n;
          int fast=sumofsquares(n);
          while(fast!=1 && slow !=fast)
          {
              slow=sumofsquares(slow);
              fast=sumofsquares(sumofsquares(fast));
          }
          return fast==1;
       }
    public static int sumofsquares(int n1)
    {
       int sum=0;
       while(n1>0)
       {
         int digit=n1%10;
         sum+=digit*digit;
         n1=n1/10;
       }
       return sum;
    }
}
