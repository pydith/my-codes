class arm
{
    public static void main(String args[])
    {
        int t=0;
        int n1=0;
        for(int n=1;n<1000;n++)
        {
            n1=n;
            while(n>0){
            int r=n%10;
            t+=r*r*r;
            n=n/10;
            }
            if(t==n1)
            {
                System.out.println("it is arm strong number "+n1);
            }
            t=0;
            n=n1;
        } 

      
    }
}