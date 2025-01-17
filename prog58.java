class lcm
{
    public static void main(String args[])
    {
      int lcm=1;
    
    int i=12,j=8,gcd=1;
    for(int n=1;n<=i && n<=j;++n)
    {
        if(i%n==0 && j%n==0)
        {
            gcd=n;
        }
    }
    lcm=(i*j)/gcd;
    System.out.println("the lcm is" +lcm);

}
}
