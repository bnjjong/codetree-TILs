import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.print(isMultipleChar(a) ? "Yes":"No");

    }

    public static boolean isMultipleChar(String a) {
        char[] ac = a.toCharArray();
        
        Set<Character> charSet = new HashSet<>();
        for (int i=0; i<ac.length; i++) {
            charSet.add(ac[i]);
            if (charSet.size() > 2 ) {
                return true;
            }
        }

        return false;
    }
}