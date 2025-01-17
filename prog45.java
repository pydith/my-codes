class fax
{
    public static void main(String args[])
    {
        double n=5;
        double t=1;
        double sum=0;
        for(double i=1;i<=n;i++)
        {
            t=t*i;
           
            double r=1/t;
            
            sum=sum+r;
            
           
        }
        System.out.println(sum);
    }
}