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

        Arrays.sort(mArr, new Comparator<Member>() {

            @Override
            public int compare(Member m1, Member m2) {
                return m1.height - m2.height; // 오름 차순 정렬
            }
        });

        for (int i=0; i<n; i++) {
            System.out.printf("%s %d %d\n",mArr[i].name, mArr[i].height, mArr[i].weight);
        }

        

    }
}