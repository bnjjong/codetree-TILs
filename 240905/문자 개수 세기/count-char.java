import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();

        int cnt = 0;
        for (int i=0; i<a.length(); i++) {
            if (b.equals(String.valueOf(a.charAt(i)))) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}