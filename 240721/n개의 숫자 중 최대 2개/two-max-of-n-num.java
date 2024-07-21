import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int top1 = Integer.MIN_VALUE;
        int top2 = Integer.MIN_VALUE;
        for (int i=0; i<n; i++) {
            int no = sc.nextInt();
            if (top1 < no) {
                top2 = top1;
                top1 = no;
            } else if (top2 < no){
                top2 = no;
            }
        }
        System.out.printf("%d %d", top1, top2);
    }
}