import java.util.*;
class Address {
    String name;
    String postcode;
    String city;

    public Address(String name, String postcode, String city) {
        this.name = name;
        this.postcode = postcode;
        this.city = city;
    }
}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        

        Address[] arr = new Address[n];
        // String[] names = new String[n];
        for (int i=0; i<n; i++) {
            String name = sc.next();
            String postcode = sc.next();
            String city = sc.next();
            arr[i] = new Address(
                name,
                postcode,
                city
            );
            // names[i] = name;
        }

        int lastIdx = 0;
        for(int i = 1; i < n; i++) {
            // 기준 값과 비교대상이 동일한 값일 경우 0
            // 기준 값이 비교대상 보다 작은 경우 -1
            // 기준 값이 비교대상 보다 큰 경우 1 <<<<<<<<<
            if(arr[i].name.compareTo(arr[lastIdx].name) > 0)
                lastIdx = i;
        }

        System.out.println("name " + arr[lastIdx].name);
        System.out.println("addr " + arr[lastIdx].postcode);
        System.out.println("city " + arr[lastIdx].city);

        // Arrays.sort(names, Collections.reverseOrder());
        // String lastIdxName = names[0];
        
        // for (int i=0; i<n; i++) {
        //     if (lastIdxName == arr[i].name) {
        //         System.out.println("name " + arr[i].name);
        //         System.out.println("addr " + arr[i].postcode);
        //         System.out.println("city " + arr[i].city);
        //         break;
        //     }
        // }
        
    }
}