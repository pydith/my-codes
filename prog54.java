class app
{
    public static void main(String args[])
    {
        char ch;
        char j;
        for(ch = 'F';ch >= 'A';--ch)
        {
            for(j = 'A';j <= ch;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}