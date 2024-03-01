import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(calc(n));
    }


    // 재귀함수 1이 되는 순간까지
    public static int calc(int n) {
        if (n <= 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return calc((int)n / 2) + 1;
        } else {
            return calc((int)n / 3) + 1;
        }
    }
}