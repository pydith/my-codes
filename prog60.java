class bug
{
    public static void main(String args[])
    {
        int flag=0;
        for(int i=1;i<=4;i++)
        {
            int l=i;
            int p=2;
            
            for(int j=i;j<4;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=2*i-1;k++)
            {
                System.out.print(l);
                l--;
               
            }
            if(flag==1)
            {
                for(int x=1;x<i;x++)
                {
                    System.out.print(p);
                    p++;
                }
                
            
            }
            flag=1;
            System.out.println("");
            
        }
    }
}