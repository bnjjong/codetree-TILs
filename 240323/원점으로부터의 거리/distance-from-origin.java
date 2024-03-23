import java.util.*;
class Manhattan {
    int no;
    int x1;
    int x2;
    int distance;

    public Manhattan(int no, int x1, int x2) {
        this.no = no;
        this.x1 = x1;
        this.x2 = x2;

        this.distance = Math.abs(x1 + x2);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Manhattan[] mArr = new Manhattan[n];
        for (int i=0; i<n; i++) {
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            mArr[i] = new Manhattan(i+1, x1, x2);
        }

        Arrays.sort(mArr, (a,b) -> a.distance - b.distance);

        for (int i=0; i<n; i++) {
            System.out.println(mArr[i].no);
        }

    }
}