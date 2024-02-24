import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = a+b+c;
        int av = t/3;

        System.out.println(t);
        System.out.println(av);
        System.out.println(t-av);

    }
}