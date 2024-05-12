import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i=0; i<n+(n-1); i++) {
            // i , n = 3
            // 0 vv*    0,1=2(n-i-1),  1 i*2+1  
            // 1 v***   0 = 1,  3      3 i*2+1
            // 2 *****    = 0,  5.     5 i*2+1

            // 3 v***   0 = 1          3 n*2-3 4 - 0
            // 4 vv*    0 = 2          1 3-(2* (i%n)) 3-2 = 1

            // 3 + (2 * i)
            // 공백 찍기
            int spaceSize = i < n ? n-i-1 : i-n+1;
            // 마지막 -2의 경우 최대값에서 한사이클 줄어야 하는 수치 (2를 뺌.)
            int starSize = i < n ? i*2+1 :  (n*2-1)-(2*(i%n))-2; // 앞에 계산식은 시작점 구하기, 뒤에 마이너스의 경우 줄어드는 사이즈
            for (int j=0; j<spaceSize; j++) {
                System.out.print(" ");
            }
            //별 찍기
            for (int j=0; j<starSize; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}