import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        // 2 차원 배열 선언 및 내용 채우기
        int[][] grid = new int[n][n];
        // for (int i=0; i<n; i++) {
        //     int[] row = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //     for (int j=0; j<row.length; j++) {
        //         grid[i][j] = row[j];
        //         // System.out.print(grid[i][j]);
        //     }
        //     // System.out.println("");
        // }
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        // 1 * 3 최대 동전 수 구하기
        int coinMax = 0;
        int maxInGrid = 3;
        for(int i=0; i<n; i++) {
            for (int j=0; j<n-2; j++) {
                coinMax = Math.max(coinMax, grid[i][j]+grid[i][j+1]+grid[i][j+2]);
            }
            // 어짜피 max 값이 나오면 더 연산할 필요가 없다.
            if (coinMax == maxInGrid) {
                break;
            }
        }
        System.out.print(coinMax);

        



    }
}