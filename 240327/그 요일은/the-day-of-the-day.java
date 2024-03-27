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
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
    
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String iDay = sc.next();
        int iDayIdx = 0;
        
        // 두 날짜간의 차이가 몇 일인지를 구합니다.
        int diff = numOfDays(m2, d2) - numOfDays(m1, d1);
        int cntOfWeek = diff / 7;
        int restOfDiff = diff % 7;
        // System.out.println("diff: "+diff +", cnt : " +cntOfWeek +", rest : "+restOfDiff);

        String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        // iDay idx 구하기
        for (int i=0; i<dayOfWeek.length; i++) {
            if (dayOfWeek[i].equals(iDay)) {
                iDayIdx = i;
                // System.out.println("iDay idx : " + i);
                break;
            }
        }

        System.out.println(cntOfWeek + (restOfDiff > iDayIdx ? 1 : 0));




    }
}