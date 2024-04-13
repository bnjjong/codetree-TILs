import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        int days = 31;
        if (m % 2 == 0) {
            days = 30;
            if (m == 2) {
                days = 28;
            }
        }

        System.out.println(days);

        
    }
}