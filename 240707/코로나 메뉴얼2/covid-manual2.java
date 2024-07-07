import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] nArr = new int[4];
        for (int i=0; i<3; i++) {
            char yn = sc.next().charAt(0);
            int temperature = sc.nextInt();

            if (yn == 'Y' && temperature >= 37) {
                nArr[0] += 1;
            } else if (yn == 'N' && temperature >=37) {
                nArr[1] += 1;
            } else if (yn == 'Y' && temperature < 37) {
                nArr[2] += 1;
            } else {
                nArr[3] += 1;
            }
        }

        for (int i=0; i<4; i++) {
            System.out.print(nArr[i] + " ");
        }
        if (nArr[0] >= 2) {
            System.out.print("E");
        }
    }
}