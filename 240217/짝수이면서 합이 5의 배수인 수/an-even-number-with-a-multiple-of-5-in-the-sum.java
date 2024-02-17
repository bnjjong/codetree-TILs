import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isMagicN(n) ? "Yes" : "No");

    }

    public static boolean isMagicN(int n) {
        // 아래 n1, n2 코드를 (n / 10 + (n % 10)) 이렇게 대체 가능함.
        int n1 = Integer.parseInt(String.valueOf(n).substring(0,1));
        int n2 = Integer.parseInt(String.valueOf(n).substring(1));
        // System.out.printf("%d, %d",n1,n2);
        return n % 2 == 0 && (n1 + n2) % 5 == 0;
        
    }
}