// viết function truyền vào 3 số a b c. kiểm tra c có bằng a+b hay không
import java.util.Scanner;

public class LAP4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập vào số a
        System.out.print(" nhập số a : ");
        int a = scanner.nextInt();

        // nhập vào số b
        System.out.print(" nhập số b : ");
        int b = scanner.nextInt();

        // nhập vào số c
        System.out.print(" nhập số c : ");
        int c = scanner.nextInt();

        // tính tổng của a + b
        int sum = a + b;

        // kiểm tra
        if ( sum == c){
            System.out.println( c + " = a + b ");
        } else if  ( sum > c ){
            System.out.println( c + " < a + b ");
        } else {
            System.out.println( c + " > a + b ");
        }

        }
}
