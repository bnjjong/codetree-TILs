import java.util.*;
class User {
    String user;
    int level;

    public User() {
        this.user = "codetree";
        this.level = 10;
    }

    public User(String user, int level) {
        this.user = user;
        this.level = level;
    }

    

}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String user = sc.next();
        int level = sc.nextInt();

        User user1 = new User();
        User user2 = new User(user, level);

        System.out.printf("user %s lv %d\n", user1.user, user1.level);
        System.out.printf("user %s lv %d\n", user2.user, user2.level);
    }
}