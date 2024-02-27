import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a1Arr = new int[n];
        for (int i=0; i<n; i++) {
            a1Arr[i] = sc.nextInt();
        }

        int[][] a2Arr = new int[m][2];
        for (int i=0; i<m; i++) {
            for (int j=0; j<2; j++) {
                a2Arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; i++) {
            int s = a2Arr[i][0]-1;
            int e = a2Arr[i][1];
            int sum = 0;
            for (int j=s; j<e; j++) {
                sum += a1Arr[j];
            }

            System.out.println(sum);
            
       }


        


    }
}