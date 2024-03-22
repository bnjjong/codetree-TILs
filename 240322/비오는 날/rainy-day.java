import java.util.*;
class Weather {
    String date;
    String dow;
    String status;

    public Weather(String date, String dow, String status) {
        this.date = date;
        this.dow = dow;
        this.status = status;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Weather[] wArr = new Weather[n];
        for (int i=0; i<n; i++) {
            String date = sc.next();
            String dow = sc.next();
            String status = sc.next();
            wArr[i] = new Weather(date, dow, status);
        }

        int closedIdx = -1;
        for (int i=0; i<n; i++) {
            if (closedIdx == -1 && wArr[i].status.equals("Rain")) {
                closedIdx = i;
                continue;
            }
            if (closedIdx == -1) {
                continue;
            }

            if (wArr[i].status.equals("Rain") && wArr[i].date.compareTo(wArr[closedIdx].date) == -1) {
                closedIdx = i;
            }
        }

        System.out.printf("%s %s %s", wArr[closedIdx].date, wArr[closedIdx].dow, wArr[closedIdx].status);


    }
}