import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i=0; i<n; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i=0; i<n; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isSame = true;
        for (int i=0; i<n; i++) {
            if (arr1[i] != arr2[i]) {
                isSame = false;
                break;
            }
        }

        System.out.print(isSame ? "Yes": "No");


    }
}