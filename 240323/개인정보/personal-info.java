import java.util.*;
class Member {
    String name;
    int height;
    double weight;

    public Member(String name, int height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return String.format("%s %d %.1f", name, height, weight);
    }

}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = 5;

        Member[] mArr = new Member[n];
        for (int i=0; i<n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            double weight = sc.nextDouble();
            
            mArr[i] = new Member(name, height, weight);
        }

        // 이름 순으로 정렬 후 출력
        Arrays.sort(mArr, (a,b) -> a.name.compareTo(b.name));
        System.out.println("name");
        Arrays.stream(mArr).forEach(System.out::println);

        System.out.println();
        // 키 순으로 출력
        Arrays.sort(mArr, (a,b) -> b.height - a.height);
        System.out.println("height");
        Arrays.stream(mArr).forEach(System.out::println);


    }
}