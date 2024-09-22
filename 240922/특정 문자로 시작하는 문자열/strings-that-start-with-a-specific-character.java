import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] sArr = new String[n];
        for (int i=0; i<n; i++) {
            sArr[i] = sc.next();
        }
        char c = sc.next().charAt(0);
        int cnt = 0;
        int sumOfLength =0;
        for (int i=0; i<n; i++) {
            String s = sArr[i];
            if (s.charAt(0) == c) {
                cnt++;
                sumOfLength += s.length();
            }
        }
        System.out.printf("%d %.2f", cnt, (double)sumOfLength/cnt);

    }
}