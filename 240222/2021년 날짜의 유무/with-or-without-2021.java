import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String format = String.format("2021-%02d-02d",m, d);
            Date date = dateFormat.parse(format);
        } catch (ParseException e) {
            return false;
        }
        return true;
        
    }
}