import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String o = sc.next();

        System.out.print(getStartIdx(a,o));
        


        
    }

    public static int getStartIdx(String a, String o) {
        return a.indexOf(o);
    }
}