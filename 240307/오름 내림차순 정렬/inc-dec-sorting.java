import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];

        for (int i=0; i<n; i++) {
            nArr[i] = sc.nextInt();
        }

        Arrays.sort(nArr);
        for (int i=0; i<n; i++) {
            System.out.print(nArr[i]+" ");
        }
        System.out.println();

        Integer[] nArr2 = Arrays.stream(nArr).boxed().toArray(Integer[]::new);
         
        Arrays.sort(nArr2, Collections.reverseOrder());
        for (int i=0; i<n; i++) {
            System.out.print(nArr2[i]+" ");
        }
    }
}