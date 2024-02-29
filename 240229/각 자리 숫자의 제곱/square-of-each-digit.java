import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(calc(n));
    }

    // 각 자리 숫자의 제곱 계산
    public static int calc(int n) {
        if (n < 10) {
            return n * n;
        }
        int restN = n % 10;
        return calc(n / 10) + (restN * restN);
    }
}