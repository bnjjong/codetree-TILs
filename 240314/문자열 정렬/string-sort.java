import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] chars = a.toCharArray();
        Arrays.sort(chars);

        System.out.print(new String(chars));
    }
}