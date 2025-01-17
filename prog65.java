import java.util.*;
class key
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
            }
            int max = arr[0];
            int min = arr[0];
            for(int i=0;i<n;i++)
            {
                if(arr[i]>max)
                {
                    max = arr[i];
                    }
                    if(arr[i]<min)
                    {
                        min = arr[i];
                        }
                        }
                        System.out.println("Maximum element is : "+max);
                        System.out.println("Minimum element is : "+min);
                        }
                        }
                       



     
    