import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] cArr = new char[10];
        for (int i=0; i<10; i++) {
            cArr[i] = sc.next().charAt(0);
        }
        System.out.printf("%c %c %c",
            cArr[2-1],
            cArr[5-1],
            cArr[8-1]
        );
    }
}