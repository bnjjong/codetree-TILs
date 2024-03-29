import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();

        int[] result = new int[10]; // 10승을 했을 경우 1024.
        int idx = 0;
        while(true) {
            if (n < b) {
                result[idx] = n;
                break;
            }

            result[idx++] = n % b;
            n /= b;
        }

        for (int i=idx; i>=0; i--) {
            System.out.print(result[i]);
        }
        
    }
}