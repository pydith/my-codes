class Fabinocci{
    public static void main(String args[]){
        int i=0;
        int sum=0;
        int j=1;
        System.out.println(i);
        System.out.println(j);
        for(j=1;j<10;j++){
           sum=i+j;
           
           System.out.println(sum);
           i=j;
           j=sum-1;
           
          
          
        }
    }
}