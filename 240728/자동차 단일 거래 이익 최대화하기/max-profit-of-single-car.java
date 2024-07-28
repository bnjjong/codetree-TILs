import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            nArr[i] = sc.nextInt();
        }

        int maxGap = 0;
        for (int i=0; i<n; i++) {
            int buyPrice = nArr[i];
            for (int j=i+1; j<n; j++) {
                int sellPrice = nArr[j];
                int gap = sellPrice-buyPrice;
                if (gap > 0 && maxGap < gap) {
                    maxGap = gap;
                }
            }
        }
        System.out.println(maxGap);

    }
}