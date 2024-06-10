import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int[] nArr = new int[100];
        int zeroPoint = 0;
        for (int i=0; i<100; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                zeroPoint = i;
                break;
            }
            nArr[i] = n;

        }
        for (int i=0; i<zeroPoint; i++) {
            int n = nArr[i];
            if (n % 2 == 0) {
                n/=2;
            } else {
                n+=3;
            }
            System.out.print(n+" ");
        }
    }
}