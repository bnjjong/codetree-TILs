import java.util.*; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int scholarship = 0;
        if (a >= 90) {
            if (b >=95) {
                scholarship = 100000;
                
            } else if (b >= 90) {
                scholarship = 50000;
                
            } else {
                
            }
        }

        System.out.print(scholarship);
    }
}