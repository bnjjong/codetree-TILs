import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print(getGcf(n,m));
        
    }

    public static int getGcf(int n, int m) {
        int minN = n < m ? n : m;
        int maxN = Integer.MIN_VALUE;
        for (int i=1; i<minN; i++) {
            if (n % i == 0 && m % i == 0) {
                maxN = Math.max(maxN, i);
            }
        }
        return maxN;
    }
}