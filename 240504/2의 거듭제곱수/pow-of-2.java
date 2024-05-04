import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        int x = 2;
        int p = 1;
        while(true) {
            if (n == Math.pow(x,p)) {
                break;
            }
            p++;
        }
        System.out.println(p);
    }
}