import java.util.Scanner;

public class bai17 {
        /*
        Nhập 2 số tự nhiên m, n rồi kiểm tra xem chúng có nguyên tố cùng nhau không.
        (Hai số nguyên tố cùng nhau là 2 số có UCLN là 1).
         */
        public static boolean findGCD(int num1, int num2){
            for (int i = 2; i <= num1 & i <= num2; i ++){
                if ( num1 % i == 0 && num2 % i ==0) return false;
            }
            return true;
        }
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhập vào số m : ");
            int m = scanner.nextInt();
            System.out.print("Nhập vào số n : ");
            int n = scanner.nextInt();

            if (findGCD(m,n)){
                System.out.print("Có số nguyên tố cùng nhau");
            }
            else {
                System.out.print("Không có số nguyên tố cùng nhau");
            }
        }
    }