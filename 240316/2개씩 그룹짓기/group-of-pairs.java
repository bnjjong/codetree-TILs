import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] nArr = new Integer[n*2];
        for (int i=0; i<n * 2; i++) {
            nArr[i] = sc.nextInt();
        }

        System.out.print(getMinN(nArr, n));

    }

    public static int getMinN(Integer[] nArr, int n) {
        Arrays.sort(nArr, Collections.reverseOrder());
        int length = nArr.length-1;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            // System.out.printf("%d + %d\n", nArr[i], nArr[length-i]);
            max = Math.max(max, (nArr[i] + nArr[length-i]));
        }

        return max;
    }
}