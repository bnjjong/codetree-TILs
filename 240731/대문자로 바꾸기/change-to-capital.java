import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            for (int j=0; j<3; j++) {
                String s = sc.next();
                System.out.print(s.toUpperCase()+" ");
            }
            System.out.println();
        }
    }
}