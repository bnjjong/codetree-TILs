import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] nArr = new int[100];
        int cnt = 0;
        for (int i=0; i<100; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            nArr[cnt++] = num;

        }

        System.out.println(
            nArr[cnt-1]+
            nArr[cnt-2]+
            nArr[cnt-3]);
    }
}