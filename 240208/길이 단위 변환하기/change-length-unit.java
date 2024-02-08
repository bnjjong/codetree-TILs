public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double cmPerOneFt = 30.48d;
        long cmPerOneMi = 160934;
        double fit = 9.2d;
        double mile = 1.3d;
        System.out.printf("%.1fft = %.1fcm", fit, cmPerOneFt * fit);
        System.out.println("");
        System.out.printf("%.1fmi = %.1fcm", mile, cmPerOneMi * mile);
    }
}