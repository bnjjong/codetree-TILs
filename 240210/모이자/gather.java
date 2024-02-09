import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        int[] numbers = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int minNum = Integer.MAX_VALUE;
        for (int i=0; i<n; i++) {
            // 1번째 집 부터 계산
            int sum = 0;
            for (int j=0; j<n; j++) {
                // 같으면 이동 할 필요가 없음.
                if (i == j) { 
                    continue;
                }
                // i의 위치 + 사람 수 만큼 계산
                // 거리는 마이너스가 나올수 있으니 절대 값으로 변경.
                int c = numbers[j] * (Math.abs(i - j));
                // System.out.printf("i:%d, j:%d, calc:%d \n",i, j, c);
                sum += c;

            }
            if (minNum > sum) {
                minNum = sum;
            }
        }
        System.out.print(minNum);
        
    }
}