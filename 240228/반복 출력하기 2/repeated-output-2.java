import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printHello(n);
    }

    public static void printHello(int n) {
        if (n <= 0) {
            return;
        }
        n--;
        printHello(n);
        System.out.println("HelloWorld");
    }
}