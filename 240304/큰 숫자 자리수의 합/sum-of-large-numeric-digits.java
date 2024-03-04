import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        long a4 = (long)a1 * a2 * a3;
        System.out.println(calc(a4));

    }

    // 자릿수 합
    public static long calc(long n) {
        if (n < 10) {
            return n;
        }

        return calc(n / 10) + (n % 10);
    }
}