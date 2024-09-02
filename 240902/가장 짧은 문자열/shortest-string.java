import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int s1 = sc.next().length();
        int s2 = sc.next().length();
        int s3 = sc.next().length();

        int max = Math.max(Math.max(s1,s2),s3);
        int min = Math.min(Math.min(s1,s2),s3);

        System.out.print(max-min);
        
    }
}