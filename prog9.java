import java.util.StringTokenizer;

public class prog9 {
    public static void main(String[] args) {
        StringTokenizer sb = new StringTokenizer("Hello world welcvome to miracle");
        System.out.println(sb.countTokens());
        while(sb.hasMoreTokens())
        {
            System.out.println(sb.nextToken());
            
        }
        
    }
}
