import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // System.out.print(getLcm(n,m));
        System.out.print(findLCM(n,m));
    }

    public static int findLCM(int n, int m) {
        int gcd = 0;
        for(int i = 1; i <= Math.min(n, m); i++) {
            if(n % i == 0 && m % i == 0)
                gcd = i; // 12 18 일때 최종 6이 들어감.
        }
    
        return n * m / gcd; // 12 * 18 / 6이 됨. 수가 3개 이상일 경우 사용할 수 없음.
    }

    public static int getLcm(int n, int m) {
        int maxN = Math.max(n,m);
        int lcm = 1;
        for (int i=2; i<=maxN; i++) {
            if (n % i == 0 && m % i == 0) {
                // System.out.printf("%d, %d, %d \n", i, n/i, m/i);
                int n2 = n/i;
                int m2 = m/i;
                if (isPrime(n2) && isPrime(m2)) {
                    // System.out.println("isPrime.");
                    lcm *= (i * n2 * m2);
                } else {
                    lcm *= i * getLcm(n/i, m/i);
                }
                // System.out.println("lcm = " + lcm);
                break;
            }
        }
        if (lcm == 1) {
            return lcm = n * m;
        } else {
            return lcm;
        }
        
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