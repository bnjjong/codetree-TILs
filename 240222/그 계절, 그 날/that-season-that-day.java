import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if (isDate(y,m,d)) {
            String season = "";
            if (m >= 3 && m <= 5) {
                season = "Spring";
            } else if (m >= 6 && m <= 8) {
                season = "Summer";
            } else if (m >=9 && m <= 11) {
                season = "Fall";
            } else if (m ==12 || m <= 2) {
                season = "Winter";
            } else {
                season = "-1";
            }
            System.out.print(season);
        } else {
            System.out.print("-1");
        }
    }

    public static boolean isDate(int y, int m, int d) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setLenient(false);
            calendar.set(y, m - 1, d);
            calendar.getTime();
        } catch (Exception e) {
            return false;
        }
        return true;
        
    }
}