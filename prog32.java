class arr
{
    public static void main(String args[])
    {
        int[] num={1,2,3,4,5,6,7,8,9};
        int[] num1=new int[num.length];
        for(int i=0;i<num.length;i++)
        {
            num1[i]=num[i];
        }
        for(int j=0;j<num1.length;j++)
        {
            System.out.println("the array is" +num1[j]);
        }

    }
}