import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(calc(n));

    }

    public static int[] nArr = new int[20];

    public static int calc(int n) {
        if (n == 1) {
            return 2;

        }
        if (n == 2) {
            // nArr[n] = 4;
            return 4;
        }
        return calc(n - 2) * calc(n - 1) % 100; // 3, 4 

        
    }
}