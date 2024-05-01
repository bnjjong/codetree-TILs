import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] nArr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                nArr[i][j] = sc.nextInt();
            }
        }
        int[] colSum = new int[n+1];
        for (int i=0; i<n; i++) {
            int rowSum = 0;
            for (int j=0; j<n; j++) {
                System.out.print(nArr[i][j]+" ");
                rowSum += nArr[i][j];
                colSum[j] += nArr[i][j];
                if (j == n - 1) {
                    System.out.println(rowSum);
                    colSum[j+1] += rowSum;
                }
            }
            
        }
        for (int i=0; i<n+1; i++) {
            System.out.print(colSum[i]+" ");
        }
    }
}