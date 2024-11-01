import java.util.Scanner;

public class bai10 {
    /*Viết chương trình nhập số nguyên h và in ra màn hình tam giác cân ngược có độ cao h. Ví dụ với h = 4:

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên h ");
        int h = scanner.nextInt();

        /*
        hàng 1 1* = 1x2-1 ;vị trí thứ 4 = 4-1 +1 = h - row +1
        hàng 2 3* = 2x2-1 ;vị trí thứ 3 = 4-2 +1 = h - row +1
        hàng 3 5* = 3x2-1 ;vị trí thứ 2 = 4-3 +1 = h - row +1
        hàng 4 7* = 4x2-1 ;vị trí thứ 1 = 4-4 +1 = h - row +1
               star = row x 2 -1
         */

        for ( int row = 1 ; row <=h; row ++){
            for (int space = 1; space <= h-row ; space++){
                System.out.print("_");
            }
            for (int star = 1; star <= row*2-1; star ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
