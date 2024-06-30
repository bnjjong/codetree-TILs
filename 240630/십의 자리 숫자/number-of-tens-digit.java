import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        

        int[] nArr = new int[10];
        for (int i=0; i<100; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            
            num = num / 10;
            nArr[num] += 1;
            
        }

        for (int i=1; i<=9; i++) {
            System.out.printf("%d - %d\n", i, nArr[i]);
        }
    }
}