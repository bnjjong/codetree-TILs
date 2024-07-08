import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int mod = 0;
        int[] modArr = new int[10];

        while(a > 1) {
            mod = a%b;
            // System.out.printf("%d  %d = %d \n", a, b, mod);
            // System.out.printf("%d / %d = %d \n", a, b, a/b);
            a /= b;
            
            modArr[mod]++;
            
        }
        // Arrays.stream(modArr).forEach(i -> System.out.print(i + " "));

        int modSum = 0;
        for (int i=0; i<10; i++) {
            modSum += (int)Math.pow(modArr[i],2);
        }
        System.out.println(modSum);



        
    }
}