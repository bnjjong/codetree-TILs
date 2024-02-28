import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreaseN(n, 1);
        printDecreaseN(n);
    }

    public static void printIncreaseN(int n, int i) {
        if (n < i ) {
            System.out.println();
            return;
        }
        System.out.print(i+" ");
        i++;
        printIncreaseN(n, i);
    }
    public static void printDecreaseN(int n) {
        if (n < 1 ) {
            System.out.println();
            return;
        }
        System.out.print(n+" ");
        n--;
        printDecreaseN(n);
    }
    
}