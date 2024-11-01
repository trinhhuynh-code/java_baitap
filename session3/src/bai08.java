import java.util.Scanner;
public class bai08 {
    /*
    Viết chương trình nhập hai số nguyên n, m và in ra hình chữ nhật rỗng các dấu * kích thước n x m.
    Ví dụ với n = 5, m = 4:
    *  *  *  *  *
    *           *
    *           *
    *  *  *  *  *
     */
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println(" nhập vào số hàng :");
        int numrow = scanner.nextInt();
        System.out.println(" nhập vào số cột :");
        int numcol = scanner.nextInt();

        for (int i = 1; i <= numrow; i++) {
            for (int j = 1; j <= numcol; j++) {
                if (i >= 2 && i <= numrow - 1) {
                    if (j == 1 || j == numcol) System.out.print("* ");
                    else System.out.print("  ");
                }
                else System.out.print("* ");
            }
            System.out.println();
        }
    }
}
