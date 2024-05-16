import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // i, n = 6
        //   0 1 2 3 4 5
        // 0 * * * * * *
        // 1 vv*vvv*vvv*
        // 2 vvvvvv*vvv*
        // 3 vvvvvv*vvv*
        // 4           *
        // 5           *        

        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i==0) {
                    System.out.print("* ");
                    
                } else if(j%2 == 1 && i <= j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}