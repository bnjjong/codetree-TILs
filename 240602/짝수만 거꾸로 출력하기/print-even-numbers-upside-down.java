import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            nArr[i] = sc.nextInt();
        }
        for (int i=n-1; i>=0; i--) {
            if (nArr[i] % 2 == 0) {
                System.out.print(nArr[i]+" ");
            }
        }
        
    }
}