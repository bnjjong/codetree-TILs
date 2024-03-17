import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            nArr[i] = sc.nextInt();
            // debug 주석
            // System.out.printf("%d = %d\n", i, nArr[i]);
            if (i == 0) {
                System.out.print(nArr[i]+" ");
            } else if ((i+1) % 2 == 1) {
                Arrays.sort(nArr,0,i+1);
                // debug 주석
                // for (int j=0; j<nArr.length; j++) {
                //    System.out.print(nArr[j]+" "); 
                // }
                // System.out.println();
                
                // System.out.println(i);
                // System.out.println(Math.round((i+1)/2));
                System.out.print(nArr[Math.round((i+1)/2)]+" ");
            }
        }

    }
}