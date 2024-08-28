import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][n];
        for (int i=0; i<m; i++) {
            int idx1 = sc.nextInt();
            int idx2 = sc.nextInt();
            arr[idx1-1][idx2-1] = idx1 * idx2;
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}