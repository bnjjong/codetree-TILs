import java.util.*;
public class Main {
    static int[] mergedArr;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            nArr[i] = sc.nextInt();
        }
        mergedArr = new int[n];
        sortByMerge(nArr, 0, nArr.length-1);
        Arrays.stream(nArr).forEach(i -> System.out.print(i + " "));

    }
    
    public static void sortByMerge(int[] arr, int low, int high) {
        // System.out.printf("sortByMerge >>> low : %d, high : %d \n", low, high);
        if (low < high) {
            int mid = (low + high) / 2;
            // 분할
            sortByMerge(arr, low, mid); // 좌측 배열 n/2 -> n/4 재귀로 1이 될때까지 쪼갠다. 
            sortByMerge(arr, mid+1, high); //우측 배열 위와 상동
            // 정복
            doMerge(arr, low, mid, high);
        }
    }

    public static void doMerge(int[] arr, int low, int mid, int high) {
        
        // System.out.printf("doMerge >>> low : %d, mid : %d, high : %d \n", low, mid, high);
        int i = low, j = mid + 1;
        int k = low;

        // 시작점이 중간값보다 작거나 같고, 중간 값이 종점값 보다 작거나 같아야 한다.
        // 시작점은 중간점까지 가는 것, 중간점은 종단점 까지 가는 것
        // 비교해서 교환 하는 것
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                mergedArr[k] = arr[i];
                i++;
            } else {
                mergedArr[k] = arr[j];
                j++;
            }
            k++;
        }
				
				// 중간점 까지 값을 채워 주는 것
        while (i <= mid) {
            mergedArr[k] = arr[i];
            i++;
            k++;
        }
        
				// 종단점 까지 값을 채워 주는 것
        while (j <= high) {
            mergedArr[k] = arr[j];
            j++;
            k++;
        }
				
				// 배열에 다시 값을 할당
        for (k = low; k <= high; k++) {
            arr[k] = mergedArr[k];
        }

    }
}