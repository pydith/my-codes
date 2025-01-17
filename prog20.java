class demo1
{
    public static void main(String args[]){
      int n=111111;
      String num = String.valueOf(n);
      for(int i=0;i<num.length();i++)
      {
        char currentChar = num.charAt(i);
        int count=0;
        for(int j=0;j<num.length();j++)
        {
            if(currentChar == num.charAt(j))
            {
                count++;
               

            }
        
        }
        if(count>=1)
        {
            System.out.println("digits are same");
            break;
        }  
     }
   }
    
}