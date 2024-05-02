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
        System.out.println(addNum);
    }
}