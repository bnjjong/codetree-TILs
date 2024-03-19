import java.util.*;
class Secret007 {
    private String code;
    private String meetingPoint;
    private int time;

    public Secret007 (String code, String meetingPoint, int time) {
        this.code = code;
        this.meetingPoint = meetingPoint;
        this.time = time;
    }

    public String getCode() {
        return this.code;
    }

    public String getMeetingPoint() {
        return this.meetingPoint;
    }

    public int getTime() {
        return this.time;
    }
}

public class Main {
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String code = sc.next();
        String meetingPoint = sc.next();
        int time = sc.nextInt();

        Secret007 secret = new Secret007(code, meetingPoint, time);

        System.out.printf("secret code : %s\n", secret.getCode());
        System.out.printf("meeting point : %s\n", secret.getMeetingPoint());
        System.out.printf("time : %d", secret.getTime());
        

        
    }
}