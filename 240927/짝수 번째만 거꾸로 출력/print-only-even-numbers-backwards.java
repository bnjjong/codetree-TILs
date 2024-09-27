import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        List<Character> cArr = new ArrayList<>();
        for (int i=0; i<s.length(); i++) {
            if (i % 2 == 1) {
                cArr.add(s.charAt(i));
            }
        }

        for (int i=cArr.size()-1; i>=0; i--) {
            System.out.print(cArr.get(i));
        }
        
    }
}