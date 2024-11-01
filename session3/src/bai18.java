import java.util.Scanner;

public class bai18 {
    /*Nhập 2 số tự nhiên m, n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.
    (Hai số nguyên tố cùng nhau là 2 số có ước chung lớn nhất là 1)
     */

    public static int findGCD(int number1, int number2) {
        int ucln = 1;
        for (int i = 2; i <= number1 && i <= number2; i++) {
            if (number1 % i == 0 && number2 % i == 0) ucln = i;
            }
        return ucln;
    }

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập số nguyên n: ");
        int n = scanner.nextInt();
        System.out.print(" Nhập số nguyên m: ");
        int m = scanner.nextInt();

            if (findGCD(n,m)==1) {
                System.out.print(" có số nguyên tố cùng nhau");
            }
            else {
                System.out.print(" không có số nguyên tố cùng nhau");
            }
    }
}



