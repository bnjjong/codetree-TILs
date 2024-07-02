import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // 덱 선언
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++)
            dq.addLast(i + 1);

        while(dq.size() > 1) {
            dq.pollFirst();
            dq.addLast(dq.pollFirst());
        }
        
        System.out.println(dq.peekFirst());
    }
}