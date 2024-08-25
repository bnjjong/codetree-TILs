import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // System.out.println("m : "+m);


        // 코인 위치 받기.
        int[][] coinP = new int[m][2];
        for (int i=0; i<m; i++) {
            coinP[i][0] = sc.nextInt();
            coinP[i][1] = sc.nextInt();
            // System.out.print(coinP[i][0] +" " + coinP[i][1]+"\n");
        }

        // m회에 걸쳐 동전의 위치를 입력받고 올바른 위치에 1을 표기합니다.
        // 바로 마킹해도 되는군..ㅋ
        // for(int i = 0; i < m; i++) {
        //     int r = sc.nextInt();
        //     int c = sc.nextInt();
        //     arr[r][c] = 1;
        // }
               

        
        // for (int i=0; i<n; i++) {
        //     for (int j=0; j<n; j++) {
        //         arr[i][j] = 0;        
        //     }
        // }

        // 해당 동전 위치 1로 마킹
        int[][] arr = new int[n][n];
        for (int i=0; i<m; i++) {
            arr[coinP[i][0]-1][coinP[i][1]-1] = 1;
        }

        // 출력
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        
    }
}