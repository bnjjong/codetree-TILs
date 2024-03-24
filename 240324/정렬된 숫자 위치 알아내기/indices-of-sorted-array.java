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

        // // 정렬된 숫자들의 원래 인덱스를 활용한 정답 배열 저장:
        // 재배치 정렬 할 때 새로운 배열을 사용.
        // int[] answer = new int[n];
        // for(int i = 0; i < n; i++) 
        //     answer[numbers[i].index] = i + 1; // 인덱스 보정

        // // 출력:
        // for(int i = 0; i < n; i++){
        //     System.out.print(answer[i] + " ");
        // }

        

    }
}