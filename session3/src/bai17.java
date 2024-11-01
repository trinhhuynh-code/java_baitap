import java.util.Scanner;

public class bai17 {
    /*
    Nhập số tự nhiên n rồi tính tổng
    S = 1 + 1/2 +1/3 + ...+ 1/n
     */
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập số nguyên n: ");
        int n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n ; i ++){
            sum = sum + 1.0/i;
        }
        System.out.print(" Tổng là : " + sum);
    }
}
