class max
{
    public static void main(String args[])
    {
        String str="aaaabbd";
        int max=0,min=1;
        char maxchar='x';
        char minchar='x';
        
        for(int i=0;i<str.length();i++)
        {
          int count=1;
          for(int j=0;j<str.length();j++)
          {
            if(str.charAt(i)==str.charAt(j))
            {
                if(i==j)
                {
                    
                }
                
                else{
                    count++;
                }
            }
             
                   
                if(count>=max)
                {
                    max=count;
                    maxchar=str.charAt(i);
                }
                if(count<=min)
                {
                    min=count;
                    minchar=str.charAt(i);
                }
            }

        }
            
          
          System.out.println("max char is "+ maxchar+" and max count is "+max);
          System.out.println("min char is "+minchar+" and min count is "+min);
    }
}