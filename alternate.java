import java.util.Arrays;
class alternate
{
    public static void main(String args[])
    {
        int count=0;
        int num=1;
        for(int i=1;i<15;i++)
        {
            for(int j=1;j<=i;j++)
            {
                
                   
                if(i%j==0)
                {
                    
                    count++;
                    
                }
              
                
            }
            
            if(count==2)
            {
                num++;
                if(num%2==0){System.out.println(i);}
                
            }
            count=0;
            
       }
            
            

        }
    }
