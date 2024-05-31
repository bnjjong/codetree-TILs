import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int cnt=0;
        for (int i=0; i<10; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            arr[i] = n;
            cnt++;
        }
        for (int i=cnt-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}