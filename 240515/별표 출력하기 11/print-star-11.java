import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // i, n = 3
        // 0 * * * * * * * - 2의 배수 일때 전체 찍고
        // 1 *   *   *   * - 홀수 일때는 별+공백+별
        // 2 * * * * * * *
        // 3 *   *   *   *
        // 4 * * * * * * *
        // 5 *   *   *   *
        // 6 * * * * * * *
        int size = 3*(n)-(n-1); // 3*5-4 = 11
        for (int i=0; i<size; i++) { 
            for (int j=0; j<size; j++) {
                if (i % 2 == 0) {
                    System.out.print("* ");
                } else {
                  if (j % 2 == 0) {
                    System.out.print("* ");
                  } else {
                    System.out.print("  ");
                  }
                }
            }
            System.out.println();
            
        }
    }
}