import java.util.HashSet;

public class prog4
{
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;
        
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right++));
                maxLength = Math.max(maxLength, right - left);
            } else {
                set.remove(s.charAt(left++));
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));  // Output: 3
    }
}
