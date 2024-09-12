import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int length = 0;
        int cnt = 0;
        for (int i=0; i<n; i++) {
            String s = sc.next();
            // System.out.println("i:"+ i +", s : "+s);
            length += s.length(); 
            if (s.startsWith("a")) {
                cnt ++;
            }
        }

        System.out.printf("%d %d", length, cnt);
    }
}