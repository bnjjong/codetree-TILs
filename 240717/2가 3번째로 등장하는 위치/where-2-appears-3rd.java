import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nArr = new int[n];
        int cnt = 0;
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            if (num == 2) {
                cnt++;
            }
            if (cnt == 3) {
                System.out.println(i+1);
                break;
            }
        }
    }
}