import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 10;

        String[] arr = new String[n];
        for (int i=0; i<n; i++) {
            arr[i] = sc.next();
        }
        char c = sc.next().charAt(0);

        for (int i=0; i<n; i++) {
            String s = arr[i];
            if (s.charAt(s.length()-1) == c) {
                System.out.println(s);
            }
        }
    }
}