class large
{
    public static void main(String args[])
    {
        int[] arr={15,34,53,67,89,79,45,68};
        int largest=arr[0];
        int smallest=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
            
            
        }
        System.out.println("the largest:" +largest);
        System.out.println("the smallest:" +smallest);
    }
}