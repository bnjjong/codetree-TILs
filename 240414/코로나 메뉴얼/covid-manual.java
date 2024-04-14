import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int eCnt = 0;

        for (int i=0; i<3; i++) {
            String s = sc.next();
            int d = sc.nextInt();
            if (s.equals("Y")) {
                if (d >= 37) {
                    eCnt++;
                }
            } 
        }

        if (eCnt >= 2) {
            System.out.print("E");
        } else {
            System.out.print("N");
        }
        
    }
}