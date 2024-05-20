import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int no = 2;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (no >= 10) {
                    no = 2;
                }
                System.out.print(no+" ");
                no += 2;
            }
            System.out.println();
        }
    }
}