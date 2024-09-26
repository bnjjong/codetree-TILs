import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char savedChar = s.charAt(0);
        int cnt = 1;
        String result = "";
        for (int i=1; i<s.length(); i++) {
            if (savedChar != s.charAt(i)) {
                result += String.format("%c%d", savedChar, cnt);
                savedChar = s.charAt(i);
                cnt = 1;
            } else {
                cnt++;
            }
            
        }
        result += String.format("%c%d", savedChar, cnt);
        System.out.println(result.length());
        System.out.println(result);

        
    }
}