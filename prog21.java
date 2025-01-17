class add
{
    public static void main(String args[])
    {
        int n=985643;
        String str=String.valueOf(n);
        int[] digits = new int[str.length()];
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            digits[i] = Character.getNumericValue(str.charAt(i));
            int num=Character.getNumericValue(str.charAt(str.length()-1));
            int temp=digits[i];
            temp=temp+num;
            sum=sum+temp;
            break;  
        }
      System.out.println("the addition is:" +sum);
    }
}