import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        for (int i=1; i<=n; i++) {
            if (isLeapYear(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static boolean isLeapYear(int year) {
        // 4의 배수이면서 100의 배수지만 또한 400의 배수라면 윤년입니다.
        if (year % 4 == 0 && (year % 100 == 0 && year % 400 == 0)) {
            return true;
        }
        // 4의 배수이면서 100의 배수라면 윤년이 아닙니다.
        if (year % 4 == 0 && year % 100 == 0) {
            return false;
        }
        // 그 외에 4의 배수라면 윤년입니다.
        if (year % 4 == 0) {
            return true;
        }
        
        // 나머지는 윤년이 아님.
        return false;

        

    }
}