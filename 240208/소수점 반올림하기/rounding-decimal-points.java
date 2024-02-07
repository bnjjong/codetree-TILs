import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double a = Math.round(25.352d * 10) / 10.0;
        // 위에 계산 없이 자동으로 반올림 해줌.
        System.out.printf("%.1f", a);
    }
}