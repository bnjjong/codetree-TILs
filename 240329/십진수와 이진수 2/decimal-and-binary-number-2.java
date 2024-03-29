import java.util.*;
public class Main {
    public static int binaryToDecimal(int binary) {
        int decimal = 0;
        int power = 1;

        while (binary > 0) {
            decimal += (binary % 10) * power;
            binary /= 10;
            power *= 2;
        }

        return decimal;
    }

    public static int[] decimalToBinary(int n) {
        int result[] = new int[20];
        int idx = 0;
        while(true) {
            if (n < 2) {
                result[idx] = n;
                break;
            }

            result[idx++] = n % 2;
            n /= 2;
            // System.out.print(result[idx-1]);
        }
        return result;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int decimal = binaryToDecimal(n) * 17;
        

        int[] binary = decimalToBinary(decimal);

        boolean isStartPrint = false;
        for (int i=binary.length-1; i>=0; i--) {
            if (!isStartPrint && binary[i] == 1 ) {
                isStartPrint = true;
            }
            if (!isStartPrint) {
                continue;
            }
            System.out.print(binary[i]);
            
        }

    }
}