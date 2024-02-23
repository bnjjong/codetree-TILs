import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double ft = sc.nextDouble();
        double length = ft * 30.48d;

        System.out.printf("%.1f", length);

    }
}