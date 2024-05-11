import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // n = 3
        // 0 ****** // 0
        // 1 **  ** // 2 3-1=2
        // 2 *    * // 1 3-2=1
        
        // n = 4
        // 0 ******** // 0 n-i = 4-0   0-1 = -1
        // 1 ***  *** // 3 n-i = 3    0 i-1 = 0
        // 2 **    ** // 2 n-i = 2    1 i-1(2-1) = 1
        // 3 *      * // 1 n-i = 1    2 n-i+1 (3-1) = 2

        for (int i=0; i<n; i++) {
            // 좌변 찍기
            for (int j=0; j<n; j++) {
                if (n-i <= j) { 
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            // 우변 찍기
            for (int j=0; j<n; j++) {
                if (j <= i-1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }
    }
}