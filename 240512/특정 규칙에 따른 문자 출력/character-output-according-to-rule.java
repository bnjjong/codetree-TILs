import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // i n = 3
        // 0 v v @ = 2 n-i-1, 1 i+1
        // 1 v @ @ = 1        2
        // 2 @ @ @ = 0        3 
        // 공백없이 찍기만
        // 0 @ @  2  (n-1)-(i*1)
        // 1 @    1   (n-1)-(i*1) 2-1

        // 상단 찍기
        for (int i=0; i<n; i++) {
            // 공백 찍기
            for (int j=0; j<n-i-1; j++) {
                System.out.print("  ");
            }

            // 골뱅이 찍기
            for (int j=0; j<i+1; j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }

        // 하단 찍기
        for (int i=0; i<n-1; i++) {
        
            // 골뱅이 찍기
            for (int j=0; j<(n-1)-(i*1); j++) {
                System.out.print("@ ");
            }
            System.out.println();
        }
    }
}