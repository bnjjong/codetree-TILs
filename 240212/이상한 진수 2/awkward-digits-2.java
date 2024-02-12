import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        char[] binary = n.toCharArray();
        boolean isAllNumber1 = true;
        String result = "";
        for (int i=0; i<binary.length; i++) {
            char a = binary[i];
            if (a == '0') {
                binary[i] = '1';
                isAllNumber1 = false;
                break;
            }
        }
        if (isAllNumber1) {
            binary[binary.length-1] = '0';
        }
        int resultMaxNum = Integer.parseInt(new String(binary), 2);

        System.out.print(resultMaxNum);

        // 해설 코드에서 실망 스러운 부분은 가독성이 너무 구리다는 점이다.
        // 완전 탐색이라는 주제가 정해져 있긴 하지만 예제나 해설 코드에 좀 더 신경을 쓰면 좋을 것 같다. 
        // 1. binary.length() 여기에 왜 캐스팅을 한건지 이해가 안됨.
        // 2. 이런 코드는 솔직히 가독성이 너무 떨어진다..  그 외 캐스팅이 너무 남발 되어 정신이 없다;;
        //    binary = binary.substring(0, i) + (char)((int)'0' + '1' - binary.charAt(i)) + binary.substring(i + 1);
        
        // int ans = Integer.MIN_VALUE;
        // for(int i = 0; i < (int) binary.length(); i++) {
        //     // i번째 자릿수를 바꿉니다.
        //     binary = binary.substring(0, i) + (char)((int)'0' + '1' - binary.charAt(i)) + binary.substring(i + 1);
        //     // 십진수로 변환합니다.
        //     int num = 0;
        //     for(int j = 0; j < (int) binary.length(); j++)
        //         num = num * 2 + (binary.charAt(j) - '0');
            
        //     // 가능한 십진수 값 중 최댓값을 구해줍니다.
        //     ans = Math.max(ans, num);
            
        //     // i번째 자릿수를 원래대로 돌려놓습니다.
        //     binary = binary.substring(0, i) + (char)((int)'0' + '1' - binary.charAt(i)) + binary.substring(i + 1);
        // }

    }
}