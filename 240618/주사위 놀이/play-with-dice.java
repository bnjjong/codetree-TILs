import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] nArr = new int[6];
        for (int i=0; i<10; i++) {
            int num = sc.nextInt();
            nArr[num-1]++;
        }
        for (int i=0; i<nArr.length; i++) {
            System.out.printf("%d - %d \n", i+1, nArr[i]);
        }


    }
}