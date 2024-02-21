import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();
        try {
            System.out.printf("%d %s %d = %d",a, op, b, calc(a,b,op));
        } catch(IllegalArgumentException e) {
            System.out.print("False");
        }
        
    }

    public static int calc(int a, int b, String op) {
        int result = 0;
        switch (op) {
            case "+" : result = a+b;
            break;

            case "-" : result = a-b;
            break;

            case "*" : result = a*b;
            break;

            case "/" : result = a/b;
            break;
            default : throw new IllegalArgumentException();
        }
        return result;
    }
}