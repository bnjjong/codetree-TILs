import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(calc(n));
    }

    // 재귀 함수로 나누어 1만들기 
    public static int calc(int n) {
        if (n == 1) {
            return 0;
        }

        return calc(n % 2 == 0 ? n/2 : (n * 3) + 1) + 1;
    }
}