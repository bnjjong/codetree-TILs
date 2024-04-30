import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i=1; i<n; i++) {
            if (findDivisors(n,i)) {
                // System.out.println(i);
                sum+=i;
            }
        }

        System.out.print(n == sum ? "P" : "N");

        
    }

    // 약수가 맞는지?
    public static boolean findDivisors(int a, int b) {
        if (a % b == 0) {
            return true;
        }
        return false;
    }
}