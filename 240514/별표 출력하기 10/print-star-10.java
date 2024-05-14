import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=0; i<n*2; i++) {
            int idx = i % 2 == 0 ? 1 + (i / 2) : n - (i - 1) / 2;
            for (int j=0; j<idx; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}