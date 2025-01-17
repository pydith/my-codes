// class demo
// {
//     public static void main(String args[])
//     {
//         for(int i=1;i<6;i++)
//         {
//             if(i>1)
//             {
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j+" ");
//             }
//         } 
//         if(i>=3)
//         {
//             for(int k=1;k<i;k++)
//             {
//                 System.out.print(k);
//             }
//         }   
          
//          System.out.println();
//     }
//         }


//     }
public class demo {
    public static void main(String[] args) {
        int n = 10; 
        StringBuilder pattern = new StringBuilder();

        
        for (int i = 1; i <= n * 2 - 1; i++) {
        
            int count = (i <= n) ? i : (n * 2 - i);

        
            for (int j = 1; j <= count; j++) {
                pattern.append(j).append(" ");
            }
            pattern.append("\n");
        }

        System.out.print(pattern);
    }
}

