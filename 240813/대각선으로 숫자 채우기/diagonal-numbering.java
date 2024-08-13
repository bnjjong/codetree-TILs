import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int idx = 1; 
        int row = 0, col = 0;
        for (int i=1; i<=n+m-1; i++) {
            // 시작 위치
            if (i <= m) {
                row = 1;
                col = i;
            } else {
                // 1은 나머지가 계속 0이므로, 따로 처리
                row = m == 1 ? i : i - m + 1;
                col = m;
            }
            // System.out.printf("start row : %d, col : %d \n", row, col);
            // System.out.println("idx : "+idx);
            while(true) {
                // 탈출 점.
                if (row > n || col < 1) {
                    break;
                }
                arr[row-1][col-1] = idx++;
                // 아래로 한칸, 좌측으로 한칸 옮긴다.
                row++;
                col--;
            }
        }
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}