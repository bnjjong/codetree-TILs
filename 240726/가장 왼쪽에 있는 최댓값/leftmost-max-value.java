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
        int result1 = getMaxIdx(nArr, n);
        int result2 = getMaxIdx(nArr, result1-1);

        System.out.printf("%d %d", result1, result2);

        
    }

    public static int getMaxIdx(int[] arr, int endIdx) {
        int maxIdx = 0;
        int maxN = Integer.MIN_VALUE;
        for (int i=0; i<endIdx; i++) {
            if (maxN < arr[i]) {
                maxIdx = i+1;
                maxN = arr[i];
            }
        }
        return maxIdx;
    }
}