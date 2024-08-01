import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[4];
        int[] arr2 = new int[4];
        for (int i=0; i<4; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i=0; i<4; i++) {
            arr2[i] = sc.nextInt();
        }
        
        int avg1=0, avg2=0;
        int vAvg1=0, vAvg2=0, vAvg3=0, vAvg4=0;
        // 평균 구하기
        for (int i=0; i<4; i++) {
            avg1 += arr1[i];
            avg2 += arr2[i];
            if (i == 0) {
                vAvg1 = arr1[i] + arr2[i];
            } else if (i == 1) {
                vAvg2 = arr1[i] + arr2[i];
            } else if (i == 2) {
                vAvg3 = arr1[i] + arr2[i];
            } else if (i == 3) {
                vAvg4 = arr1[i] + arr2[i];
            }
        }
        // 가로 평균
        System.out.printf("%.1f %.1f \n", (double)avg1/4, (double)avg2/4);

        // 세로 평균
        System.out.printf("%.1f %.1f %.1f %.1f \n", (double)vAvg1/2, (double)vAvg2/2, (double)vAvg3/2, (double)vAvg4/2);
        
        // 전체 평균
        System.out.printf("%.1f", (double)(avg1+avg2)/8);




    }
}