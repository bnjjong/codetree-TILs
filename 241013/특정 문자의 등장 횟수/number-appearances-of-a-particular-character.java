import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        String ee = "ee";
        String eb = "eb";

        int eecnt = 0;
        int ebcnt = 0;

        for (int i=0; i<n.length()-1; i++) {
            String currentStr = n.substring(i);
            if (currentStr.startsWith(ee)) {
                eecnt++;
            }
            if (currentStr.startsWith(eb)) {
                ebcnt++;
            }
        }

        System.out.printf("%d %d", eecnt, ebcnt);
        
    }
}