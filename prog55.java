class star
{
    public static void main(String args[])
    {
        for(int i=1;i<=7;i++)
        {
            for(int j=1;j<=2*i-1;j++)
            {
            System.out.print(" ");
            if(i==j){

            System.out.print(i);
            }else{
                System.out.print("*");
            }
            }
            System.out.println();
        }
    }
}