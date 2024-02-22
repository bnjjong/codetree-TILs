import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.print(isDate(m,d) ? "Yes" : "No");
    }

    public static boolean isDate(int m, int d) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setLenient(false);
            calendar.set(2021, m - 1, d);
            calendar.getTime();
        } catch (Exception e) {
            return false;
        }
        return true;
        
    }
}