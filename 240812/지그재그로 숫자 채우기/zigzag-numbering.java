import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                int idx = 0;
                if (j % 2 == 0) {
                    idx = i+(j * n);
                } else {
                    idx = (n * (j+1)) -1 - i;
                }
                System.out.print(idx+" ");
            }
            System.out.println();
        }
    }
}