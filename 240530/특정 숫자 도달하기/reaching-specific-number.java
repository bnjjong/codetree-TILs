import java.util.*;public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        

        int sum = 0;
        int cnt = 0;
        for (int i=0; i<10; i++) {
            int n = sc.nextInt();
            if (n < 250) {
                sum += n;
                cnt ++;
            } else {
                break;
            }
        }
        System.out.printf("%d %.1f", sum, (double)sum/cnt);
    }
}