import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int diff;
        int sIdx;

        if(a > b) {
            diff = a-b;
            sIdx = a;
        } else {
            diff = b-a;
            sIdx = b;
        }

        for (int i=0; i<=diff; i++) {
            System.out.print(sIdx-- + " ");
        }
        
    }
}