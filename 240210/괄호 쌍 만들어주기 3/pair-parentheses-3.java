import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int inputSize = input.length();
        // 1. '(' 를 찾는다. 
        // 2. 해당 위치에서 그 뒤의 ')' 나온것 만큼 더한다.
        // 3. 반복해서 '(' 를 찾는다.
        int resultSum = 0;
        for(int i=0; i<inputSize; i++) {
            char s = input.charAt(i);
            if (s == '(') {
                for (int j=i+1; j<inputSize; j++) {
                    char s2 = input.charAt(j);
                    if (s2 == ')')  {
                        resultSum++;
                    }
                }
            }
        }

        System.out.print(resultSum);
    }
}