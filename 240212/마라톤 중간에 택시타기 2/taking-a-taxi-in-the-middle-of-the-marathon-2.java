import java.util.Scanner;
import java.lang.Math;
public class Main {
    private static final int MAX_N = 100;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 체크 포인트
        int[][] xy = new int[MAX_N][MAX_N];
        for (int i=0; i<n; i++) {
            for (int j=0; j<2; j++) {
                xy[i][j] = sc.nextInt();
                // System.out.print(xy[i][j]+" ");
            }
            // System.out.println("");
        }
        
        

        int minDistance = Integer.MAX_VALUE;
        int highestDistance = Integer.MIN_VALUE;

        // 거리 구하기
        // 시작점과 마지막 점은 제외하고 가장 높은 거리가 나오는 구간을 제외하면 된다.
        // 일단 모든 거기를 다 구해야 함.
        for (int i=1; i<n-1; i++) {
            int sum = 0;
            // System.out.println("i:"+i);
            for (int j=0; j< n-1; j++){
                if (j == i) continue; 
                int compareXyIdx = j+1 == i ? j + 2 : j + 1;
                int distanceX = Math.abs(xy[j][0] - xy[compareXyIdx][0]);
                int distanceY = Math.abs(xy[j][1] - xy[compareXyIdx][1]);
                sum += distanceX+ distanceY;
            }
            
            // System.out.println("sum:"+sum);
            minDistance = Math.min(minDistance, sum);
        }

        System.out.print(minDistance);
    }
}