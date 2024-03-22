import java.util.*;
class Student implements Comparable<Student>{
    int no;
    int height;
    int weight;

    public Student(int no, int height, int weight) {
        this.no = no;
        this.height = height;
        this.weight = weight;
    }
    @Override
    public int compareTo(Student student) {
        // 키가 더 큰 학생이 앞에 와야 합니다.
        // 키가 동일하다면, 몸무게가 더 큰 학생이 앞에 와야 합니다.
        // 키와 몸무게가 동일하다면, 번호가 작은 학생이 앞에 와야 합니다.
        // if (this.height == student.height && this.weight == student.weight) {
        //     return this.no - student.no;
        // }
        // else if (this.height == student.height) {
        //     return student.weight - this.weight;
        // }
        // return student.height - this.height;
        // 키가 크면 정렬 했을 때 앞에 와야 합니다.
        if(this.height != student.height)
            return student.height - this.height; // 내림 차순 정렬
        // 몸무게가 크면 정렬 했을 때 앞에 와야합니다.
        if(this.weight != student.weight)
            return student.weight - this.weight; // 내림 차순
        // 번호가 작으면 앞에 와야 합니다.
        return this.no - student.no; // 그외 순번 오름 차순
        
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] nArr = new Student[n];
        for (int i=0; i<n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            nArr[i] = new Student(i+1, h, w);
        }
        Arrays.sort(nArr);

        for (int i=0; i<n; i++) {
            System.out.printf("%d %d %d\n", nArr[i].height,nArr[i].weight, nArr[i].no);
        }


    }
}