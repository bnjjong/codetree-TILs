import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sb1.append("*");
                sb2.append("*");
            }
            sb1.append("\n");
            sb2.append("\n");
        }
        System.out.print(sb1.toString());
        System.out.println();
        System.out.print(sb2.toString());
    }
}