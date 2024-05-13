import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n = 3
        // vv*
        // v* *
        // * * *
        // 위쪽 별
        for (int i=0; i<n; i++) {
            // 공백 찍기
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }

            // 별 찍기
            for (int j=0; j<i+1; j++) {
                System.out.print("* ");
            }      
            System.out.println();      
        }
        
        // v* * 
        // vv*
        // 아래 별
        for (int i=0; i<n-1; i++) {
            // 공백 찍기
            for (int j=0; j<i+1; j++) {
                System.out.print(" ");
            }

            // 별 찍기
            for (int j=0; j<n-i-1; j++) {
                System.out.print("* ");
            }      
            System.out.println();      
        }
    }
}