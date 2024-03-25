import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();

        int resultM = 0;
        while(true) {
            if (h1 == h2 && m1 == m2) {
                break;
            }
            
            resultM++;
            m1++;
            if (m1 == 60) {
                h1++;
                m1 = 0;
                
            }
 
        }

        System.out.print(resultM);
    }
}