import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            nArr[i] = sc.nextInt();
        }

        // int min = Integer.MAX_VALUE;
        // for (int i=0; i<n; i++) {
        //     int compareN1 = nArr[i];
        //     for (int j=0; j<n; j++) {
        //         if (i == j) {
        //             continue;
        //         }
        //         int compareN2 = nArr[j];
        //         int diff = Math.abs(compareN1-compareN2);
        //         if (min > diff) {
        //             min = diff;
        //         }
        //     }
        // }
        // System.out.println(min);
        
        // O(N)
        int min = nArr[1]-nArr[0];

        for (int i=2; i<n; i++) {
            if (min > nArr[i]- nArr[i-1]) {
                min = nArr[i]- nArr[i-1];
            }
        }

        System.out.println(min);
    }
}