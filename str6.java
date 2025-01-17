class pro6
{
    public static void main(String args[])
    {
        String s1="my name is durga";
        String[] res=s1.split(" ");
        for(String c:res)
        {
            for( int i=0;i<1;i++)
            {
                char ch=Character.toUpperCase(c.charAt(i));
                String s = String.valueOf(ch);
                String sub=c.substring(i+1);

                System.out.println( s + sub);
            }
        }
    }
}