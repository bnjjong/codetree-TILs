import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n % 2 == 0 ? calcEven(n) : calcOdd(n));

    }
    

    public static int calcOdd(int n) {
        if (n == 1) {
            return 1;
        }
        return calcOdd(n -2) + n;
    }

    public static int calcEven(int n) {
        if (n == 2) {
            return 2;
        }
        return calcEven(n -2) + n;
    }
}