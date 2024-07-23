import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = -1;
        int[] arr = new int[n];
        int[] cntArr = new int[n];
        int cnt = 0;
        for (int i=0; i<n; i++) {
            int no = sc.nextInt();
            // 중복 체크
            boolean isDuplication = false;
            for (int j=0; j<n; j++) {
                if (no == arr[j]) {
                    cntArr[j]++;
                    isDuplication = true;
                    break;
                }
            }
            if (!isDuplication) {
                arr[cnt] = no;
                cntArr[cnt] = 1;
                cnt++;
            }
        }
        for (int i=0; i<cntArr.length; i++) {
            if (cntArr[i] == 1) {
                max = arr[i] > max ? arr[i] : max;
            }
        }

        System.out.println(max);


    }
}