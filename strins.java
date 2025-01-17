public class strins {
    public static void main(String args[])
    {
        String[] s={"java","welcome"};
        String[] s1={"hello","java"};
         for(int i=0;i<s.length;i++)
         {
            for(int j=0;j<s1.length;j++)
            {
                if(s[i].equals(s1[j]))
                {
                    System.out.println("the duplicate is:"+s[i]);
                }
            }
         }  
    }
}
