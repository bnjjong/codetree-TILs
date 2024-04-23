import java.util.*;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigDecimal dividend = new BigDecimal(a);
        BigDecimal divisor = new BigDecimal(b);

        // 나눗셈 수행
        BigDecimal result = dividend.divide(divisor, 20, BigDecimal.ROUND_DOWN);

        System.out.println(result);
        
        



        
    }
}