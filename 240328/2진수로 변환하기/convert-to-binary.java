import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[17]; // 17승을 했을 경우 10만이 넘는다.  
        int idx = 0;
        while(true) {
            if (n < 2) {
                result[idx++] = n;
                break;
            }

            result[idx++] = n % 2;
            n /= 2;
        }

        for (int i=idx-1; i>=0; i--) {
            System.out.print(result[i]);
        }
    }
}