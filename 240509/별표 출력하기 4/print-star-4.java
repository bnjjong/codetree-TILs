import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 5 = 9
        for (int i=n+(n-1); i>0; i--) { //i - n 5
            int jSize = i >= n ? i-n+1 : n-(i-1);
            for (int j=1; j<=jSize; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}