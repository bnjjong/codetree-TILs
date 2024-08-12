import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                int idx = 0;
                if (j % 2 == 0) {
                    idx = i+(j * n);
                } else {
                    // n 홀수 열에서는 (전체 로우 X 현재 로우 idx) -1
                    // 아래로 내려갈 수록 i 만큼 빼줘야 함.
                    idx = (n * (j+1)) -1 - i;
                }
                System.out.print(idx+" ");
            }
            System.out.println();
        }
    }
}