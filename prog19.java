class demo {
    public static void main(String args[]) {
        int n = 33344775;
        String str = String.valueOf(n);

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 1; 

         
            for (int j = i + 1; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    count++;
                    if (count > 0) {
                        System.out.println("The digit " + currentChar + " is repeated " + count + " times.");
                        
                       
                        count = 0;
                    }
                }
            }

           
            
        }
    }
}
