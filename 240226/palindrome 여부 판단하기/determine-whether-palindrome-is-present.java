import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.print(isPalindrome(a) ? "Yes" : "No");
    }

    public static boolean isPalindrome(String a) {
        String reverseStr = "";
        char[] strArr = a.toCharArray();
        for (int i=strArr.length-1; i>=0; i--) {
            // System.out.print(String.valueOf(strArr[i]));
            reverseStr += String.valueOf(strArr[i]);
        }

        return a.equals(reverseStr);
    }
}