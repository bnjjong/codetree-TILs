import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        String[] fruits = new String[]{"apple","banana","grape","blueberry", "orange"};

        int cnt = 0;
        for (int i=0; i<fruits.length; i++) {
            if (fruits[i].charAt(2) == a || fruits[i].charAt(3) == a) {
                cnt++;
                System.out.println(fruits[i]);
            }
        }
        System.out.println(cnt);
    }
}