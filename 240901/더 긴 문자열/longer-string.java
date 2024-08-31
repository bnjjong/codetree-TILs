import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        // String a = str.split(" ")[0];
        // String b = str.split(" ")[1];

        if (a.length() > b.length()) {
            System.out.printf("%s %d", a, a.length());
        } else if (a.length() < b.length()) {
            System.out.printf("%s %d", b, b.length());
        } else {
            System.out.print("same");
        }

        
    }
}