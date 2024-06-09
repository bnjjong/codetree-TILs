import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int idx = 1;
        while(true) {
            if (cnt == 2) {
                break;
            }
            long result = n * idx++;
            
            if (result % 5 == 0) {
                cnt++;
            }
            System.out.print(result+" ");

        }
    }
}