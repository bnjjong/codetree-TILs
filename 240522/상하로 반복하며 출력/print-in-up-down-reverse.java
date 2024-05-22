import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
// i n = 4
// 0 1414
// 1 2323
// 2 3232
// 3 4141        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (j % 2 == 0) {
                    System.out.print(i+1);
                } else {
                    System.out.print(n-i);
                }
            }
            System.out.println();
        }
    }
}