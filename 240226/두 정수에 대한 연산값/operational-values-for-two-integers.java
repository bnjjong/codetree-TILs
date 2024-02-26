import java.util.*;
class IntW {
    private int n;

    public IntW(int n) {
        this.n = n;
    }

    public int getValue() {
        return this.n;
    }
    public void setValue(int n) {
        this.n = n;
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
        modifyN(aw, bw);

        System.out.printf("%d %d", aw.getValue(), bw.getValue());

    }

    public static void modifyN(IntW aw, IntW bw) {
        int a  = aw.getValue();
        int b  = bw.getValue();
        if (a > b) {
            a += 25;
            b *= 2;
        } else {
            a *= 2;
            b += 25;
        }
        aw.setValue(a);
        bw.setValue(b);
    }
}