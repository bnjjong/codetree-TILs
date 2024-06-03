import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int avgForSum = 0;
        int avgForCnt = 0;
        for (int i=1; i<=10; i++) {
            int n = sc.nextInt();
            if (i % 2 == 0) {
                sum += n;
            }

            if (i % 3 == 0) {
                avgForSum += n;
                avgForCnt++;
            }
        }
        System.out.printf("%d %.1f", sum, (double)avgForSum / avgForCnt);
    }
}