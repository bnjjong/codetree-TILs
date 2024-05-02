import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            // 짝수이면서 4의 배수가 아닌 수
            // 8로 나눈 몫이 짝수인 수
            // 7로 나눈 나머지가 4보다 작은 수
            if (i % 2 == 0 && i % 4 != 0) {
                // System.out.println("1 : "+i);
                continue;
            }
            if ((i / 8) % 2 == 0  ) {
                // System.out.println("2 : "+i);
                continue;
            }
            if (i % 7 < 4  ) {
                // System.out.println("3 : "+i);
                continue;
            }
            System.out.print(i+" ");
        }
    }
}