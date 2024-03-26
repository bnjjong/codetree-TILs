import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        int sd = 11;
        int sh = 11;
        int sm = 11;

        int totalMin1 = (d * 24 * 60) + (h * 60) + m;
        int totalMin2 = (sd * 24 * 60) + (sh * 60) + sm;
        
        // 11일 11시 11분 보다 작다면 (계산 불가)
        if (totalMin1 < totalMin2) {
            System.out.println(-1);
        } else {
            // 쉬운 답
            System.out.println(totalMin1 - totalMin2);
            // int elapsedMinute = 0;
            // while(true) {
            //     if (sd == d && sh == h && sm == m) {
            //         break;
            //     }
            //     elapsedMinute++;
            //     sm++;
            //     // System.out.printf("%d-%d:%d\n",sd, sh, sm);
            //     if (sm == 60) {
            //         sh++;
            //         sm = 0;

            //         if (sh == 24) {
            //             sd++;
            //             sh = 0;
            //         }
            //     }
            // }
            // System.out.println(elapsedMinute);

        }

        

        
    }
}