import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String answer1 = n.contains("ee") ? "Yes" : "No";
        String answer2 = n.contains("ab") ? "Yes" : "No";
        System.out.printf("%s %s", answer1, answer2 );

    }
}