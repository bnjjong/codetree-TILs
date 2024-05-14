import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        // n = 4
        // 0 * * * * n-(i/2) = 4
        // 1 *       1+(i-1)/2   
        // 2 * * *   4-1 = 3
        // 3 * *
        // 4 * *     4-2 = 2
        // 5 * * *
        // 6 *
        // 7 * * * *
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for (int i=0; i<n * 2; i++) {
            int idx = i % 2 == 0 ? n-(i/2) : 1+(i-1)/2;
            for (int j=0; j<idx; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}