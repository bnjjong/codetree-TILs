import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        String t = sc.next();


        String[] sArr = new String[n1];
        for (int i=0; i<n1; i++) {
            sArr[i] = sc.next();
        }

        Arrays.sort(sArr);

        int matchIdx = 0;
        for (int i=0; i<n1; i++) {
            // System.out.println(sArr[i]);
            if (sArr[i].startsWith(t) && ++matchIdx == n2) {
                System.out.print(sArr[i]);
                break;
            }
        }
    }
}