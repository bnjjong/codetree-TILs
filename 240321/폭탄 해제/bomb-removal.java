import java.util.*;
class Bomb {
    String code;
    String color;
    int second;

    public Bomb(String code, String color, int second) {
        this.code = code;
        this.color = color;
        this.second = second;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String color = sc.next();
        int second = sc.nextInt();

        Bomb bomb = new Bomb(code, color, second);

        System.out.printf("code : %s\n", bomb.code);
        System.out.printf("color : %s\n", bomb.color);
        System.out.printf("second : %d\n", bomb.second);
        
    }
}