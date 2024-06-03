import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for (int i=1; i<=10; i++) {
            int n = sc.nextInt();
            if (i == 3 || i==5 || i==10) {
                sum += n;
            }
        }
        System.out.println(sum);

    }
}