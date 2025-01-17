class pro7
{
    public static void main(String args[])
    {
        String s1="hello world";
        String s2="hello world";
        int count =0;
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
            {
              count++;
            }
            if(count==s1.length())
            {
                System.out.println("both strings are equal");
            }
            
        }
    }
}