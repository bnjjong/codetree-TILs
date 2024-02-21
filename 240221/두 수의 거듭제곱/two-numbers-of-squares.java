import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(doSquare(a,b));
    }

    public static long doSquare(int a, int b) {
        long sum = 1;
        for (int i=0; i<b; i++) {
            sum *= a;
        }
        return sum;
    }
}