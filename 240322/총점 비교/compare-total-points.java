import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student) {
        // ex) 오름차순 7 > 5  => 자리바꿈 ( 왼쪽 값이 클 때)
        // ex) 내림차순 5 < 7  => 자리바꿈 ( 오른쪽 값이 클 때)
        return (this.kor + this.eng + this.math) - (student.kor + student.eng + student.math);
    }
    
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] sArr = new Student[n];
        for (int i=0; i<n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();
            sArr[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(sArr);

        for (int i=0; i<n; i++) {
            System.out.printf("%s %d %d %d\n", sArr[i].name
            , sArr[i].kor
            , sArr[i].eng
            , sArr[i].math);
        };
    }
}