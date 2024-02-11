import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static final int MAX_N = 15;

    public static int n, m;
    public static char[][] grid = new char[MAX_N][MAX_N];

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 세로변
        m = sc.nextInt(); // 가로변

        // System.out.println(n);
        // System.out.println(m);

        // 2차원 배열 만들기
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                grid[i][j] = sc.next().charAt(0);
                // System.out.print(grid[i][j]);
            }
            // System.out.println("");
        }

        // 이동 할 수 있는 경우의 수 구하기
        // 1. 점프를 통해서 이동시 W -> B, B -> W 로만 이동이 가능 함.
        // 2. 이동은 점프로 가능하고 한카이상 오른쪽에 위치 + 한칸이상 아래에 위치로 점프 가능
        // 3. 시작, 도착 지점을 제외하고 점프하며 도달한 위치가 2곳이여야 함. 시작 -> 점프2번 -> 도착
        // 4. 시작점은 (1,1), 도착점은 (r, c) 고정
        

        int cnt = 0;
        
        for (int i=1; i<n; i++) {
            for (int j=1; j<m; j++) {
                for (int k = i+1; k<n-1; k++) { // 도착 지점 제외하기 위해 -1
                    for (int l = j+1; l<m-1; l++) { // 도착 지점 제외하기 위해 -1
                        if (grid[0][0] != grid[i][j] &&  // 첫 번째 점프
                            grid[i][j] != grid[k][l] && // 두 번째 점프
                            grid[k][l] != grid[n-1][m-1]) // 도착 지점
                        {

                            cnt++;
                        }
                    }
                }

            }
        }
        System.out.print(cnt);
    }

    
}