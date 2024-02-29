import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sumFact(n));

    }

    public static int sumFact(int n) {
        if (n == 1) {
            return 1;
        }

        return sumFact(n -1) + n;
    }
}