import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new int[9];
        for (int i=0; i<n; i++) {
            int num = sc.nextInt();
            result[num-1]+=1;
        }
        Arrays.stream(result).forEach(i -> System.out.println(i));

    }
}