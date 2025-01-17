class sort
{
    public static void main(String args[])
    {
        int[] arr={1,6,4,56,8,5,7,3,2,9};
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int num : arr)
        {
            System.out.println(num+" ");
        }
    }
}