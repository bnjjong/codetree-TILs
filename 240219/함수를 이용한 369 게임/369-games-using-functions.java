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
}