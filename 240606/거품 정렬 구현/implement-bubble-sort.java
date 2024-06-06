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
        sortByBubble(nArr);
        for (int i=0; i<n; i++) {
            System.out.print(nArr[i]+" ");
        }

    }

    public static void sortByBubble(int[] arr) {
        int size = arr.length;
        boolean sorted;

        do {
            sorted = true;
            for (int i=0; i<size-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] =  temp;
                    sorted = false;
                }
            }
        } while (!sorted);
    }
}