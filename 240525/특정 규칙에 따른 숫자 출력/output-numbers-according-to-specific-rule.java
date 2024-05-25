import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // n = 3
        // 1 2 3
        //   4 5
        //     6

        int cnt = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                // 공백 찍기
                if (i > j) {
                    System.out.print("  ");
                } else {
                    System.out.print(cnt++ +" ");
                }
                if (cnt > 9) {
                    cnt = 1;
                }
            }
            System.out.println();
        }
    }
}