import java.util.*;

class IntW {
    int value;

    public IntW(int n) {
        this.value = n;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntW aw = new IntW(a);
        IntW bw = new IntW(b);

        modify(aw, bw);

        System.out.printf("%d %d", aw.value, bw.value);

    }

    public static void modify(IntW aw, IntW bw) {
        int a = aw.value;
        int b = bw.value;

        if (a > b) {
            aw.value = a * 2;
            bw.value = b + 10;
        } else {
            aw.value = a + 10;
            bw.value = b * 2;
        }
    }
}