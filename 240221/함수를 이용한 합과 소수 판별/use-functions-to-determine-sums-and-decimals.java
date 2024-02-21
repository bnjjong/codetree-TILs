import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i=a; i<=b; i++) {
            if (isConditionN(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean isConditionN(int n) {
        if (isPrime(n)) {
            // System.out.println(n);
            // System.out.println("n = " + n);
            int sum = 0;
            if (n < 10) {
                sum = n;
            } else {
                while(n >= 10) {
                    sum += n % 10;
                    n = n/10;
                    if (n < 10) {
                        sum += n;
                    }
                    // System.out.print("sum="+sum+" ");
                }
                // System.out.println();
            }
            
            if (sum % 2 ==0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}