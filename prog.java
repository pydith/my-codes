class demo
{
    public static void main(String args[])
    {
        int age=19;
        try{
        try {
            age=55/0;
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        } catch(Exception e)
        {
            System.out.println("i am in catch block2");
        }
    }
    }
