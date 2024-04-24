import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int n = sc.nextInt();
        int idx;

        boolean isPlus =  ? true : false;

        if (c.equals("A")) {
            isPlus = true;
            idx = 1;
        } else {
            isPlus = false;
            idx = n;
        }
        
        
        for (int i=0; i<n; i++) {
            if (isPlus) {
                System.out.print(idx++ +" ");
            } else {
                System.out.print(idx-- +" ");
            }
            
        }

        
    }
}