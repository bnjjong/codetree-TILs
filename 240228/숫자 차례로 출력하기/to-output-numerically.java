import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreaseN(n);
        System.out.println();
        printDecreaseN(n);
    }

    public static void printIncreaseN(int n) {
        if(n == 0)                          
            return;                         

        printIncreaseN(n - 1);  
        System.out.print(n + " ");
    }
    public static void printDecreaseN(int n) {
        if(n == 0)                          
            return;                         

        System.out.print(n + " ");
        printDecreaseN(n - 1);
    }
    
}