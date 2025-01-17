public class perfect {
    public static void main(String args[])
    {
        long t=0;
        long total=0;
        for(long i=1;i<10000;i++)
        {
            long count=0;
            
            for(long j=1;j<i;j++)
            {
                if(i%j==0)
                {
                    count=count+j;
                }
                
            }
            
                if(count==i)
                {
                    
                    System.out.println(i+"is a perfect number");
                    t++;
                }
                if(t<=10&&count==i)
                {
                    total=total+i;
                }
                
            }
            System.out.println("the total of ten perfect numbers:" +total);
        }
    }
    
    

