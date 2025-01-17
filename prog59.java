class gcd{
    public static void main(String args[])
    {
        int a=17;
        int b=19;
        int gcd=1;
        int smaller=Math.min(a,b);
        for( int n=1;n<=smaller;n++)
        {
            if(a%n==0 && b%n==0)
            {
                gcd=n;
                System.out.println("the gcd is:" +gcd);
            }
        }

    }
}