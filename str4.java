class word
{
    public static void main(String args[])
    {
        String s1="hello what is ur name!!!!";
        int count =0;
        int sum=0;
        int len=0;
        int word=0;
        int con=0;
        String[] num=s1.split(" ");
        for(String c : num)
        {
            word++;
        }
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
            {
                 count++;
            }
            else if(s1.charAt(i)==0||s1.charAt(i)==1||s1.charAt(i)==2||s1.charAt(i)==3||s1.charAt(i)==4||s1.charAt(i)==5||s1.charAt(i)==6||s1.charAt(i)==7||s1.charAt(i)==8||s1.charAt(i)==9)
            {
                sum++;
            }
            else if(s1.charAt(i)== '!'||s1.charAt(i)=='@'||s1.charAt(i)=='#'||s1.charAt(i)=='$'||s1.charAt(i)=='%'||s1.charAt(i)=='^'||s1.charAt(i)=='&'||s1.charAt(i)=='*')
            {
                len++;
            }
            else{
                con++;
            }
        }
        System.out.println("the number of words in a string:" +word);
        System.out.println("the number of numbers in a string:" +sum);
        System.out.println("the number of special in a String:" +len);
        System.out.println("the number of vowels in a string:" +count);
        System.out.println("the number of con in a String:" +con);
    }
}