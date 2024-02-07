public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int weightPendulum = 13;
        float gravitationalRatioMoon = 0.165f;
        System.out.printf("%d * %.6f = %.6f", weightPendulum, 
            gravitationalRatioMoon, 
            weightPendulum * gravitationalRatioMoon);
    }
}