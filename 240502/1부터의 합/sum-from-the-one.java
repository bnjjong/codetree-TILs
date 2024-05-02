import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int addNum = 1;
        while (true) {
            sum += addNum;
            if (sum >= n) {
                break;
            }
            addNum++;
        }

        // 1부터 증가시키며 더한 값이 n이상이 된 순간, 더해진 숫자를 출력합니다.
        // for(int i = 1; i <= 100; i++) {
        //     sum += i;
        //     if(sum >= n) {
        //         System.out.print(i);
        //         break;
        //     }
        // }
        System.out.println(addNum);
    }
}