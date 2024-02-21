import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i=a; i<=b; i++) {
            if (isIntactN(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
    
    public static boolean isIntactN(int n) {
        if (n % 2 == 0 ||
        n % 10 == 5 ||
        (n % 3 == 0 && n % 9 !=0)) {
            return false;
        }
        return true;
    }
}