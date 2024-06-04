import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sum1 = 0, sum2 = 0;

        for (int i=1; i<=10; i++) {
            if (i % 2 == 1) {
                sum1 += sc.nextInt();
            } else {
                sum2 += sc.nextInt();
            }
        }
        System.out.print(
            sum1 > sum2 ? sum1 - sum2 : sum2 - sum1
        );
    }
}