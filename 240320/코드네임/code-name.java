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

        List<Agent> agents = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String code = sc.next();
            int point = sc.nextInt();    
            Agent a = new Agent(code, point);
            agents.add(a);
        }

        int min = Integer.MAX_VALUE;
        Agent forPrint = null;
        for (int i=0; i<agents.size(); i++) {
            if (min > agents.get(i).point) {
                min = agents.get(i).point;
                forPrint = new Agent(agents.get(i).code, agents.get(i).point);
            }
            
        }

        System.out.printf("%s %d", forPrint.code, forPrint.point);

        
        




    }
}