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
        for (int i=0; i<n; i++) {
            System.out.print(nArr[i] + " ");
        }
    }

    public static void sortBySelection(int[] arr) {
        int length = arr.length;

        for (int i=0; i<length-1; i++) {
            int minIdx = i;
            // 0번 idx 부터 하나씩 채워 간다.
            // 가장 작은 idx를 루프를 돌면서 찾는다.
            for (int j=i+1; j<length-1; j++) {
                if (arr[minIdx] > arr[j]) {
                    minIdx = j;

                }
            }
            // 치환
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }   
    }
}