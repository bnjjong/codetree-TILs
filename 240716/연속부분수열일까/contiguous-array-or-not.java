import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] aArr = new int[a];
        for (int i=0; i<a; i++) {
            aArr[i] = sc.nextInt();
        }
        int[] bArr = new int[b];
        for (int i=0; i<b; i++) {
            bArr[i] = sc.nextInt();
        }

        int startN = bArr[0];
        boolean isPartA = false;
        for (int i=0; i<=a-b; i++) { 
            if (aArr[i] == startN) {
                isPartA = true;
                for (int j=1; j<b; j++) {
                    if (aArr[i+j] != bArr[j]) {
                        isPartA = false;
                        break;
                    }
                }
                if (isPartA) {
                    break;
                }
            }
        }

        System.out.println(isPartA ? "Yes" : "No");
        

    }
}