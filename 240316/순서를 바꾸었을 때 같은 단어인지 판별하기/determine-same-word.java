import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean isSame = true;
        for (int i=0; i<c1.length; i++) {
            if (c1[i] != c2[i]) {
                isSame = false;
                break;
            }
        }

        System.out.print(isSame ? "Yes" : "No");
    }
}