import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = n;

        int idx = 1;
        while(true) {
            int nextInt = arr[idx] + arr[idx-1];
            arr[idx+1] = nextInt;
            idx++;
            if (nextInt > 100) {
                break;
            }
            
        }

        for (int i=0; i<=idx; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}