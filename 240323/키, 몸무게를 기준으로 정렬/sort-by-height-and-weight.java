import java.util.*;
class Member {
    String name;
    int height;
    int weight;

    public Member(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return String.format("%s %d %d", name, height, weight);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Member[] mArr = new Member[n];
        for (int i=0; i<n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            
            mArr[i] = new Member(name, height, weight);
        }

        Arrays.sort(mArr, (a,b) -> {
            if (a.height != b.height) {
                return a.height - b.height;
            }
            if (a.weight != b.weight) {
                return b.weight - a.weight;
            }
            return a.height - b.height;
        });

        Arrays.stream(mArr).forEach(System.out::println);
    }
}