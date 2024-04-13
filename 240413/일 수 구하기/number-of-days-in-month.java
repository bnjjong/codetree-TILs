import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        int oddDays = 0;
        int evenDays = 0;
        int result = 0;
        if (m <= 7) {
            oddDays = 31;
            evenDays = 30;
        } else {
            oddDays = 30;
            evenDays = 31;
        }

        if (m % 2 == 0) {
            result = evenDays;
            if (m == 2) {
                result = 28;
            }
        } else {
            result = oddDays;
        }

        System.out.println(result);

        
    }
}