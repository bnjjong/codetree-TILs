import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int[] arr = new int[10];
        arr[0] = a1;
        arr[1] = a2;
        
        for (int i=2; i<10; i++) {
            arr[i] = (arr[i-2]*2) + arr[i-1];
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}