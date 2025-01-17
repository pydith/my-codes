class even
{
    public static void main(String args[])
    {
        int n=568372;
        String str=String.valueOf(n);
        int[] digits=new int[str.length()];
        int sum=0,count=0;
        for(int i=0;i<str.length();i++)
        {
            digits[i]= Character.getNumericValue(str.charAt(i));
            int temp=digits[i];
            if(temp%2==0)
            {
                sum=sum+temp;
            }else{
                count=count+temp;
            }
        }
        System.out.println("the addition of even numbers:" +sum);
        System.out.println("the addition of odd numbers:" +count);
    }
}