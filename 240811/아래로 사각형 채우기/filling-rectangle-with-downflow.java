import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int idx = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print((i+1) + (j * n) + " ");
            }
            System.out.println();
        }
    }
}