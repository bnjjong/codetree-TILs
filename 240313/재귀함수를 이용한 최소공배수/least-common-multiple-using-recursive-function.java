import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] inputN = new long[n];
        for (int i=0; i<n; i++) {
            inputN[i] = sc.nextLong();
        }
        long result = lcm(inputN);
        
        // 결과를 출력합니다.
        System.out.print(result);

        
    }
     // 최대 공약수를 구하는 메소드
    private static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // 최소 공배수를 구하는 메소드
    public static long lcm(long... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("최소 하나의 숫자가 필요합니다.");
        }
        long result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    // 두 숫자의 최소 공배수를 구하는 메소드
    private static long lcm(long a, long b) {
        if (a == 0 || b == 0) {
            return 0; // 0으로 나누는 경우 처리
        }
        long gcdValue = gcd(a, b);
        return (a / gcdValue) * b;
    }


}