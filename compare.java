public class compare {
    public static void main(String args[])
    {
        String[] s1={"java","welcome"};
        String[] s2={"hello","welcome"};
        
        for(int i=0;i<s1.length;i++)
        {
            for(int j=0;j<s2.length;j++)
            {
                if(s1[i]==s2[j])
                {
                    System.out.println("the duplicate is: " +s1[i]);
                }
            }
        }
    }
    
}
