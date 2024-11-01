import java.util.Scanner;

public class bai07 {
    /*
    Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật đặc các dấu * kích thước n x m.
    Ví dụ với n = 5, m = 4:
    *  *  *  *  *
    *  *  *  *  *
    *  *  *  *  *
    *  *  *  *  *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng: ");
        int numRow = scanner.nextInt();

        System.out.print("Nhập vào số cột: ");
        int numCol = scanner.nextInt();

        for (int i = 1; i <= numRow; i ++){
            for (int j =1; j < numCol; j ++){
                System.out.print("* ");
            }
            System.out.println("* ");
        }
    }

}
