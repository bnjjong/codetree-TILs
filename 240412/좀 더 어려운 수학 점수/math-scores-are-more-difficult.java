import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int mathA = sc.nextInt();
        int engA = sc.nextInt();

        int mathB = sc.nextInt();
        int engB = sc.nextInt();

        String result = "";
        if (mathA > mathB || (mathA == mathB && engA > engB ) ){
            result = "A";
        } else {
            result = "B";
        }

        System.out.println(result);


        
    }
}