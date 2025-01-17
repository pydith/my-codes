class odd
{
    public static void main(String args[])
    {
        int[] arr={23,44,39,29,42,33,16,14};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==1)
            {
                System.out.println("the number is odd" +arr[i]);
            }
        }
    }
}