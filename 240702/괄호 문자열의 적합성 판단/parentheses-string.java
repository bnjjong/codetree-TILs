import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        String str = sc.next();
        Stack<Character> s = new Stack<>(); 
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(')
                s.push('(');
            else {
                if(s.empty()) {
                    System.out.print("No");
                    System.exit(0);
                }
                s.pop();
            }
        }

        if(s.isEmpty()) {
            System.out.print("Yes");
        }
        else {
            System.out.print("No");
        }
    }
}