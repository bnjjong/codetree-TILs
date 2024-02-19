import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(cntN(a,b));
    }

    public static int cntN(int a, int b) {
        int cnt = 0;
        for (int i = a; i<=b; i++) {
            if (String.valueOf(i).contains("3") || 
            String.valueOf(i).contains("6") ||
            String.valueOf(i).contains("9") ||
            i % 3 == 0) {
                // System.out.println(i);
                cnt++;
            }
            
        }
        return cnt;
        
    }

    // 3, 6, 9 숫자가 
    // 단 하나라도 포함되었는지를 확인합니다.
    // public static boolean contains369(int n) {
    //     // 계속 10으로 나눠주며
    //     // 일의 자리를 조사합니다.
    //     while(n > 0) {
    //         if(n % 10 == 3 || n % 10 == 6 || n % 10 == 9)
    //             return true;
    //         n /= 10;
    //     }

    //     return false;
    // }
}