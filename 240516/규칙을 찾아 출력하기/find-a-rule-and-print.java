import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // i, n=6
        // c 0 1 2 3 4 5
        // 0 * * * * * *    -0
        // 1 *         *    -0
        // 2 * *       *    -1
        // 3 * * *     *    -2
        // 4 * * * *   *    -3
        // 5 * * * * * *    -4
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==0 || i > j) {
                    System.out.print("* ");
                } else if (j == n-1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}