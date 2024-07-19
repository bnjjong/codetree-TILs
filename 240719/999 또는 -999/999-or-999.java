import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<100; i++) {
            int n = sc.nextInt();
            if (n == 999 || n == -999) {
                break;
            }
            if (n < min) {
                min = n;
            }

            if (n > max) {
                max = n;
            }
        }
        System.out.printf("%d %d", max, min);
    }
}