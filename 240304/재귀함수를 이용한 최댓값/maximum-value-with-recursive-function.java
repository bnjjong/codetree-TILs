import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        for (int i=0; i<n; i++) {
            numArr[i] = sc.nextInt();
        }

        System.out.println(getMaxN(n-1, numArr));

        


    }

    public static int getMaxN(int n, int[] arr) {
        if (n == 0) {
            return arr[n];
        }
        return Math.max(arr[n], getMaxN(n-1, arr));
    }
}