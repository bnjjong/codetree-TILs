import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            // 2로 나누어 떨어지는 경우
            // 일의 자리가 5인 경우
            // 3으로 나누어 떨어지면서 9로는 나누어 떨어지지 않는 수
            if (i % 2 == 0 || getOnePlace(i) == 5 || (i % 3 == 0 && i % 9 != 0) )  {
                continue;
            }
            System.out.print(i+" ");
            
        }

        
    }

    // 일의 자리 가져오기.
    public static int getOnePlace(int n) {
        return n % 10;
    }
}