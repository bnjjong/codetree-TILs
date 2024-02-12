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
            binary[binary.length] = '0';
        }
        int resultMaxNum = Integer.parseInt(new String(binary), 2);

        System.out.print(resultMaxNum);

    }
}