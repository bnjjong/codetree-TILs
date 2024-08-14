import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int idx = 1;
        for (int i=n-1; i>=0; i--) {
            // 시작점
            int row = i % 2 == 0 ? 0 : n-1;
            while (true) {
                if (row < 0 || row >= n) {
                    break;
                }
                // System.out.printf("row : %d i : %d \n", row, i);
                arr[row][i] = idx++;
                if (i % 2 == 0) {
                    row++;
                } else {
                    row--;
                }
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}