import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for (int i=1; i<=n+(n-1); i++) {
            int jSize = i <= n ? i : n-(i-n);
            for (int j=0; j<jSize; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}