import java.util.Scanner;

public class bai20 {
    /*
    Viết chương trình nhập số nguyên n và in ra màn hình hình sao :
    * * * * * * *
    *   *   *   *
    *   *   *   *
    *   *   *   *
    *   *   *   *
    *   *   *   *
    * * * * * * *

     */
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập số hàng row : ");
        int row = scanner.nextInt();

        System.out.print(" Nhập số cột col : ");
        int col = scanner.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i >= 2 && i <= row - 1) {
                    if (j % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
