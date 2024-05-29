import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        int divisorCnt = 0;

        for (int i=s; i<=e; i++) {
            int cnt = 0;
            for (int j=1; j<=i; j++) {
                if (i % j == 0) {
                    cnt ++;
                }
            }
            if (cnt == 3) {
                divisorCnt++;
            }
        }
        System.out.println(divisorCnt);
    }
}