import java.util.*;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // BigDecimal dividend = new BigDecimal(a);
        // BigDecimal divisor = new BigDecimal(b);

        // // 나눗셈 수행
        // BigDecimal result = dividend.divide(divisor, 20, BigDecimal.ROUND_DOWN);

        // System.out.println(result);
        // 정수 부분을 먼저 출력합니다.
        System.out.print(a / b + ".");
        
        // a를 b로 나눈 나머지를 시작으로
        // 소수점 자리를 하나씩 계산합니다.
        a %= b;
        for(int i = 0; i < 20; i++) {
            // 나머지에 10 곱한 값을 기준으로
            // b로 나누었을 떄의 몫을 구해줍니다.
            a *= 10;
            System.out.print(a / b);
            
            // a를 b로 나눈 나머지를 게속 갱신해줍니다.
            a %= b;
        }
        
        



        
    }
}