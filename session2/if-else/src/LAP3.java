// viết function truyền vào 1 số. kiểm tra số đó có chia hết cho 3 và 5 hay không
import java.util.Scanner;

public class LAP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập vào 1 số cần kiểm tra
        System.out.print(" nhập vào 1 số cần kiểm tra : ");
        int i = scanner.nextInt();

        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println( i + " là số chia hết cho 3 và 5 ");
        } else {
            System.out.println( i + " là số KHÔNG chia hết cho 3 và 5 ");
        }

        // cách 2
        System.out.println( " ----c2----- ");

        if ( i % 15 == 0 ) {
            System.out.println( i + " là số chia hết cho 3 và 5 ");
        } else {
            System.out.println( i + " là số KHÔNG chia hết cho 3 và 5 ");
        }
        System.out.println( " kết thúc chương trình ");
    }
}
