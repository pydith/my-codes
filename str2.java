class run
{
    public static void main(String args[])
    {
        String s="welcome to miracle";
        int length=0;
        for(char c:s.toCharArray()){
           length++;
        }
        System.out.println("length of string is "+length);
      
       for(int i=s.length()-1;i>=0;i--)
       {
          System.out.print(s.charAt(i));
       }
   
}
}