import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String[] days = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String resultDay = "";
        int idxOfday = 0;
        boolean isBefore = m1 * 100 + d1 > m2 * 100 + d2;
        while (true) {
            if (m1 == m2 && d1 == d2) {
                break;
            }
            if (isBefore) {
                d1--;
                idxOfday--;
                if (idxOfday == -1) {
                    idxOfday = 6;
                    resultDay = days[idxOfday];
                }

                if (d1 == 0) {
                    m1--;
                    d1 = num_of_days[m1];
                }
            } else {
                d1++;
                idxOfday++;
                resultDay = days[idxOfday % 7];
                // System.out.println(resultDay);

                if (num_of_days[m1] == d1) {
                    d1 = 1;
                    m1 ++;
                    // System.out.println("d1 : "+d1+", m1 : "+m1);

                }
            }
            
        }

        System.out.println(resultDay);

        






        
    }
}