import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        int[] digitArray = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            digitArray[i] = Character.getNumericValue(n.charAt(i));
        }

        int num = 0;
        for(int i = 0; i < n.length(); i++) {
            // System.out.printf("num : %d, num * 2 : %d, binary : %d \n", num, num*2, digitArray[i]);
            num = num * 2 + digitArray[i];
            
        }

        System.out.print(num);
            


        
    }
}