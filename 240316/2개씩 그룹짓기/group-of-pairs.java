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

        System.out.print(getMinN(nArr, n));

    }

    public static int getMinN(int[] nArr, int n) {
        Arrays.sort(nArr);
        int length = nArr.length-1;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            max = Math.max(max, (nArr[i] + nArr[length-i]));
        }

        return max;
    }
}