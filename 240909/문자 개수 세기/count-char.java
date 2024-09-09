import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char c = sc.next().charAt(0);

        int cnt = 0;
        for (int i=0; i<line.length(); i++) {
            if (line.charAt(i) == c) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}