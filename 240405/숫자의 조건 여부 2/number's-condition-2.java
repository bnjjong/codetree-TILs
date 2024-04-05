import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String result = "";
        if (a == 5) {
            result = "A";
        }

        if (a / 2 == 0) {
            result = "B";
        }

        System.out.print(result);
    }
}