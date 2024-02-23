import java.util.*;
class IntW {
    int value;

    public IntW(int a) {
        this.value = a;
    }
    public int getValue() {
        return value;
    }

    public void setValue(int a ) {
        this.value = a;
    }
}
public class Main {
    private static int a;
    private static int b;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        IntW a1 = new IntW(a);
        IntW b1 = new IntW(b);
        exchangeValue(a1, b1);

        System.out.printf("%d %d", a1.getValue(),b1.getValue());

    }

    public static void exchangeValue(IntW a, IntW b) {
        int x = a.getValue();
        a.setValue(b.getValue());
        b.setValue(x);
    }
}