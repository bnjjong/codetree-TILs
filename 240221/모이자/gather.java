import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            // System.out.println(a[i]);
        }

        // 1번째 집부터 차례대로 계산 하자.
        
        int min = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            int sumDiff = 0;
            for (int j=i; j<n+i; j++) {
                int idx = 0;
                if (j >= n) {
                    idx = j % n;
                } else {
                    idx = j;
                }
                
                sumDiff += a[idx] * (Math.abs(i-idx));
            }
            min = Math.min(min, sumDiff);
        }
        System.out.print(min);
    }
}