import java.util.*;

class Agent {
    String code;
    int point;

    public Agent(String code, int point) {
        this.code = code;
        this.point = point;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = 5;

        Agent[] agents = new Agent[n];
        for (int i=0; i<n; i++) {
            String code = sc.next();
            int point = sc.nextInt();    
            agents[i] = new Agent(code, point);
        }

        // int min = Integer.MAX_VALUE;
        // Agent forPrint = null;
        // for (int i=0; i<agents.size(); i++) {
        //     if (min > agents.get(i).point) {
        //         min = agents.get(i).point;
        //         forPrint = new Agent(agents.get(i).code, agents.get(i).point);
        //     }
            
        // }

        // 최소 점수를 갖는 요원 찾기
        int minIdx = 0;
        for(int i = 1; i < n; i++) {
            if(agents[minIdx].point > agents[i].point)
                minIdx = i;
        }

        System.out.printf("%s %d", agents[minIdx].code, agents[minIdx].point);

        
        




    }
}