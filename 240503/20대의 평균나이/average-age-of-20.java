import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int sum = 0, cnt = 0;
        while(true) {
            int n = sc.nextInt();
            if (n >= 20 && n < 30) {
                sum += n;
                cnt++;
            } else {
                break;
            }
        }

        System.out.printf("%.2f", (double)sum/cnt);
    }
}