import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int result1 = 0;
        int result2 = Integer.MAX_VALUE;
        for (int i=0; i<10; i++) {
            int n = sc.nextInt();
            if (n < 500 && result1 < n) {
                result1 = n;
            } else if (n > 500 && result2 > n) {
                result2 = n;
            }
        }
        System.out.printf("%d %d", result1, result2);
    }
}