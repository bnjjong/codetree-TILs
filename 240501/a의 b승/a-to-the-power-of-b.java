import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a의 b승 구하기.
        int multiply = 1;
        for (int i=0; i<b; i++) {
            multiply *= a;
        }

        System.out.println(multiply);
    }
}