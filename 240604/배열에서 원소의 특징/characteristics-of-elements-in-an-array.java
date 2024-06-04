import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] nArr = new int[10];
        for (int i=0; i<10; i++) {
            nArr[i] = sc.nextInt();
            if (nArr[i] % 3 == 0) {
                System.out.println(nArr[i-1]);
                break;
            }
        }
    }
}