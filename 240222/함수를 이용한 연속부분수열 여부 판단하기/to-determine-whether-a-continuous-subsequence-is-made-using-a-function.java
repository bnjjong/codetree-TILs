import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();

        int[] a1Arr = new int[a1];
        for (int i=0; i<a1; i++) {
            a1Arr[i] = sc.nextInt();
        }
        int[] a2Arr = new int[a2];
        for (int i=0; i<a2; i++) {
            a2Arr[i] = sc.nextInt();
        }

        System.out.print(isContains(a1Arr, a2Arr)? "Yes" : "No");        
    }

    public static boolean isContains(int[]a , int[] b) {
        int startN = b[0];
        for (int i=0; i<a.length; i++) {
            // 현재 인덱스에서 남은 인덱스 차를 구하고 비교할 b와 사이즈 비교해서 break
            // 4자리수에서 현재 인덱스가 2라면 
            // 4-2 = 2 즉 2자리가 남게 되고 b array 사이즈가 3이라면 굳이 비교할 필요가 없다.
            // 따라서 아래와 같은 조건일때는 break 처리 하고 루프를 빠져 나간다.
            if (a.length - i < b.length) {
                break;
            } 
            if (a[i] == startN) {
                boolean isMatch = true;
                // a 배열과 b 배열을 순차적으로 비교 한다.
                for (int j=0; j<b.length; j++) {
                    if (a[i+j] != b[j]) {
                        isMatch = false;
                    }
                }
                if (isMatch) {
                    return true;
                }
            }
        }
        return false;
    }
}