import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        char[] arr = {'L','E','B','R','O','S'};

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        String result = "None";
        for (int i=0; i<arr.length; i++) {
            if (c == arr[i]) {
                result = i+"";
                break;
            }
        }
        System.out.println(result);
    }
}