class dup
{
    public static void main(String args[])
    {
        int[] num={1,2,3,4,5,6,7,8,9,10,4,6,8,9};
       
        for(int i=0;i<num.length;i++)
        {
            for(int j=1;j<num.length;j++)
            {
                if(num[i]==num[j])
                {
                   System.out.println(num[i]);
                }
               
            }
        }
       
    }
}