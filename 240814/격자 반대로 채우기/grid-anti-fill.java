import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int idx = 1;
        for (int i=n-1; i>=0; i--) { // 컬럼 위치
            
            // 입력이 짝수 이면 짝수점(인덱스는 홀수) 은 로우를 마이너스 처리 되야 함.
            // int row = n % 2 == 0 && i % 2 == 1 ? n-1 : 0;
            // 5(n)-4(i) == 홀수면 마이너스, 짝수면 플러스 처리
            boolean isMinusRow = (n - i) % 2 == 1;
            // 시작점
            int row = isMinusRow ? n-1 : 0;
            while (true) {
                if (row < 0 || row >= n) {
                    break;
                }
                // System.out.printf("row : %d i : %d \n", row, i);
                arr[row][i] = idx++;
                if (isMinusRow) {
                    row--;
                } else {
                    row++;
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