class irr
{
    public static void main(String args[])
    {
        double n=5;
        double t=0;
        double sum=0;
        for(double i=1;i<=n;i++)
        {
           t=t+(1/Math.pow(i,2));
           sum=sum+t;
        }
        System.out.println(sum);
    }
}