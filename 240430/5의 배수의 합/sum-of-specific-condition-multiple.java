import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > a) {
            int c = b;
            int b = a;
            int a = b;
        }

        int sum = 0;
        for (int i=a; i<=b; i++) {
            if (i % 5 == 0) {
                sum+=i;
            }
        }
        System.out.print(sum);
    }
}