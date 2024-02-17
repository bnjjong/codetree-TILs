import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        int[] ra = new int[n];
        for (int i=0; i<n; i++) {
            ra[i] = sc.nextInt();
            // System.out.println(ra[i]);
        }
        // 방 개수를 돌면서 사람수를 확인
        int minSum = Integer.MAX_VALUE;
        // i 는 룸 시작
        for (int i=0; i<n; i++) {
            int isum = 0;
            // 시작 점.
            int s = i;
            // j 룸 가중치
            // for (int j=0; j<n; j++) {
            //     // 시작점을 가져와야 함.
            //     isum += ra[s] * j;
            //     // System.out.printf("s = %d, isum = %d\n", s, isum);
            //     s++;
            //     if (s >= n) {
            //         s = 0;
            //     }
                
            // }
            for(int j = 0; j < n; j++) {
                // 거리 구하기. 간단하지만 가독성이 좀.. 내가 수학을 못해서 그런가...;;
                int dist = (j + n - i) % n; // (3 + 5 - 2) = 6 % 5 = 1 
                isum += dist * ra[j];
            }
            minSum = Math.min(minSum, isum);
        }
        System.out.print(minSum);
    }
}