class finder
{
    public static void main(String args[])
    {
        int[] num={1,2,3,4,2,3,2,2,9};
        int n=3;
        int frq=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==n)
            {
                frq++;
            }
        }
        System.out.println("the frequency of" +n+ "is" +frq);
    }
}