import java.util.*;
public class Main {
    public static int numOfDays(int m, int d) {
        // 계산 편의를 위해 월마다 몇 일이 있는지를 적어줍니다. 
        int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        // 1월부터 (m - 1)월 까지는 전부 꽉 채워져 있습니다.
        for(int i = 1; i < m; i++)
            totalDays += days[i];
        
        // m월의 경우에는 정확이 d일만 있습니다.
        totalDays += d;
        
        return totalDays;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
    
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        // 두 날짜간의 차이가 몇 일인지를 구합니다.
        int diff = numOfDays(m2, d2) - numOfDays(m1, d1);

        // 음수인 경우에는, 양수로 넘겨 계산해주면 올바르게 계산이 됩니다. 
        // +7 하는 이유는 월요일 전일이면 -> 일요일로 가야 함.
        // 2 2 -> 2 1 = -1 += 7 = 6(일요일)이 나옴 
        // Mon -> 0 + 
        while(diff < 0)
            diff += 7;

        String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.print(dayOfWeek[diff % 7]);

        // int date1 = m1 * 100 + d1;
        // int date2 = m2 * 100 + d2;
        // boolean isBefore = date1 > date2;

        // String[] days = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        // int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // String resultDay = "";
        // int idxOfday = 0;
        // if (date1 == date2) {
        //     System.out.println(days[0]);
        // } else {
        //     while (true) {
        //         if (m1 == m2 && d1 == d2) {
        //             break;
        //         }
        //         if (isBefore) {
        //             d1--;
        //             idxOfday--;
        //             if (idxOfday == -1) {
        //                 idxOfday = 6;
        //             }
        //             resultDay = days[idxOfday];

        //             if (d1 == 0) {
        //                 m1--;
        //                 d1 = num_of_days[m1];
        //             }
        //         } else {
        //             d1++;
        //             idxOfday++;
        //             resultDay = days[idxOfday % 7];
        //             // System.out.println(m1+"-"+d1+" : "+resultDay);

        //             if (num_of_days[m1] == d1) {
        //                 d1 = 0;
        //                 m1 ++;
        //                 // System.out.println("d1 : "+d1+", m1 : "+m1);
        //             }
        //         }
                
        //     }    
        // }
        // System.out.println(resultDay);

    }
}