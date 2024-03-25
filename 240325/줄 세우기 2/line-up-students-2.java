import java.util.*;
class Student {
    int no;
    int height;
    int weight;
    public Student (int no, int height, int weight) {
        this.no = no;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return String.format("%d %d %d", height, weight, no);
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] sArr = new Student[n];
        for (int i=0; i<n; i++) {
            sArr[i] = new Student(i+1, sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(sArr, (a,b) -> {
            if (a.height != b.height) {
                return a.height - b.height;
            }
            return b.weight - a.weight;
        });

        Arrays.stream(sArr).forEach(System.out::println);


    }
}