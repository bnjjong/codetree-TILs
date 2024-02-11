import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] cowHeightArr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = cowHeightArr.length;
        // 최종 조건에 만족하는 카운트
        // i<j<k, a1<a2<a3
        // i j k는 소의 위치
        // aN은 소의 키
        int resultCnt = 0;

        // loop를 돌면서 index 0 부터 완전 탐색.
        // i 번째 보다 큰 index에서 i 번째 숫자보다 큰 숫자가 2개 이상 존재 하면 count 하면 될 듯.
        for (int i=0; i < cnt; i++) {
            int ci = cowHeightArr[i];
            for (int j=i+1; j < cnt; j++) {
                if (ci > cowHeightArr[j]) {
                    continue;
                }
                for (int k = j+1; k <cnt; k++) {
                    if (cowHeightArr[j] > cowHeightArr[k]) {
                        continue;
                    }
                    resultCnt++;
                }
            }
        }

        // 해설
        // for(int i = 0; i < n; i++)
        //     for(int j = i + 1; j < n; j++)
        //         for(int k = j + 1; k < n; k++)
        //             if(arr[i] <= arr[j] && arr[j] <= arr[k])
        //                 cnt++;

        System.out.print(resultCnt);

    }
}