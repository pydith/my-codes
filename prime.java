public class prime {
    public static void main(String[] args) {
        int i;
        int count=0;
        for(i=50;i<=150;i++){
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2){
            System.out.println(i+"is a prime number");
            }
            count=0;
        }

    }
}
