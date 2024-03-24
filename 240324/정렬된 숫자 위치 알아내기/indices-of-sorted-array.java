import java.util.*;
class PositionN {
    int n;
    int initIdx;
    int sortedIdx;

    public PositionN(int n, int initIdx) {
        this.n = n;
        this.initIdx = initIdx;
    }

    public void setSortedIdx(int idx) {
        this.sortedIdx = idx;
    }

    
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        PositionN[] arr = new PositionN[n];
        for (int i=0; i<n; i++) {
            arr[i] = new PositionN(sc.nextInt(), i);
        }

        Arrays.sort(arr, (a,b)->{
            if (a.n == b.n) {
                return a.initIdx - b.initIdx;
            }
            return a.n - b.n;
        });

        // sorted idx 
        
        for (int i=0; i<n; i++) {
            arr[i].setSortedIdx(i+1);
        }

        Arrays.sort(arr, (a,b)-> a.initIdx - b.initIdx);

        for (int i=0; i<n; i++) {
            System.out.print(arr[i].sortedIdx+" ");
        }

        

    }
}