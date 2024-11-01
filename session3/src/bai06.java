import java.util.Scanner;
public class bai06 {
    /*
    Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
    Ví dụ: Số 8545604 có tổng các chữ số là: 8 + 5 + 4 + 5 + 6 + 0 + 4 = 32
     */
    public static int sumOfn(int num){
        int sum = 0; // Biến lưu tổng các chữ số, đầu tiên khởi tạo bằng 0
        while (num > 0) { // Lặp cho đến khi num = 0
            int digit = num % 10;
            sum += digit;   // sum += num % 10
            num /= 10;
        }
        return sum;
    }
    public static void main (String [] agrs){
        Scanner scanner = new Scanner (System.in);
        System.out.println(" nhập vào số n : ");
        int n = scanner.nextInt();

        int sum = sumOfn(n);
        System.out.println(" tổng các chữ số của " + n + " là : " + sum);

    }
}
