import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int cnt = 0;
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            if (num < min) {
                cnt = 0;
                min = num;
            }
            if (num == min) {
                cnt++;
            }
        }
        System.out.printf("%d %d", min, cnt);
    }
}