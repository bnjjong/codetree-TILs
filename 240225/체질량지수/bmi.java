import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double bmi = Math.floor(b * Math.pow(100,2) / Math.pow(a,2));
        System.out.printf("%.0f\n", bmi);
        if (bmi >= 25) {
            System.out.print("Obesity");
        }
    }
}