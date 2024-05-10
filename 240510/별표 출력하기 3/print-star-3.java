import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<i; j++) {
                System.out.print("  ");
            }
            // idx 1번째 줄 = (2*5)-(2*0)-1 = 10-0-1 = 9;
            // idx 2번째 줄 = (2*5)-(2*1)-1 = 10-2-1 = 7;
            for (int j=0; j<(2*n)-(2*i)-1; j++) { 
                System.out.print("* ");
            }           
            System.out.println();
        }
    }
}