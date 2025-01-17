class recur {
    public static void main(String[] args) {
        int n = 97856;
        recur obj = new recur();
        double result = obj.display(n);
        System.out.println("Sum of digits: " + result);
    }

    double display(int n) {
        int sum = 0;
        while (n != 0) {
            int m = n % 10;
            sum = sum + m;
            n = n / 10;
        }
        return sum;
    }
}
