public class prog5 {
    public static void main(String[] args) {
        String s="hell[] wel@#me";
        int count=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='!'|| arr[i]=='@'|| arr[i]=='#'|| arr[i]=='$'|| arr[i]=='%'|| arr[i]=='^'|| arr[i]=='&'|| arr[i]=='*'|| arr[i]=='('|| arr[i]==')'|| arr[i]=='['|| arr[i]==']'|| arr[i]=='{'|| arr[i]=='}'){
                   count++;
            }
        }
        System.out.println("the special char count is:"+count);
    }
    
}
