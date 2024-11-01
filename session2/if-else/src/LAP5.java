// viết function nhập vào biến mark từ 0-100. Kiểm tra giá trị biến mark và in ra
// A nếu mark >= 85
// B nếu 70 <= mark < 85
// C nếu 40 <= mark < 70
// D là các trường hợp còn lại

import java.util.Scanner;

public class LAP5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mark
        System.out.print(" nhập mark : ");
        int mark = scanner.nextInt();

        // Kiểm tra

        if ( mark > 100 ) {
            System.out.println(" Error! ");
        } else if ( mark >= 85 && mark <= 100) {
            System.out.println(" A ");
        } else if ( mark >= 70 && mark < 85 ) {
            System.out.println(" B ");
        } else if ( mark >= 40 && mark < 70 ) {
            System.out.println(" B ");
        } else if ( mark >= 0 && mark < 40 ) {
            System.out.println(" A ");
        }else {
            System.out.println(" Error!! ");
        }

    }
}

