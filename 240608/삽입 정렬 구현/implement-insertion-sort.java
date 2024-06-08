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

        sortBySelection(nArr);
        Arrays.stream(nArr).forEach(num -> System.out.print(num+" "));

    }

    public static void sortBySelection(int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int key = arr[i];
            // System.out.println("key : " + key);
            for (int j=i-1; j>=0; j--) {
                if (key < arr[j]) {
                    // 값 치환
                    arr[j+1] = arr[j];
                    arr[j] = key;
                    // System.out.printf("j[%d] : %d, j[%d+1] : %d \n", j, arr[j], j, arr[j+1]);
                }
            }
        }
    }
}