import java.util.*;
class Product {
    String name;
    int code;

    public Product(String name, int code) {
        this.name = name;
        this.code = code;
    }
}
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int code = sc.nextInt();

        Product product1 = new Product("codetree", 50);
        Product product2 = new Product(name, code);

        System.out.printf("product %d is %s\n", product1.code, product1.name);
        System.out.printf("product %d is %s\n", product2.code, product2.name);

        

    }
}