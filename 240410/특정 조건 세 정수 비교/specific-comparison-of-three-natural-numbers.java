import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result1 = (a == Math.min(Math.min(a, b), c)) ? 1 : 0;
        System.out.print(result1+" ");

        int result2 = (a == b && b == c) ? 1 : 0;
        System.out.print(result2);


        
    }
}