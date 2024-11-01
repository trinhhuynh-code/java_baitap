import java.util.Scanner;

public class bai04 {
    //Viết chương trình liệt kê n số nguyên tố đầu tiên.

    public static boolean checkPrime(int num){
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++){
            //kiểm tra số ngto: dùng hàm Math.sqrt (n)

            if ( num % i == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập n : ");
        int n = scanner.nextInt();

        int number = 2; // số bắt đầu kiểm tra
        int count = 0; // đếm số nguyên tố tìm ra, khởi tạo = 0

        while(count <= n) { //trong khi
            if (checkPrime(number)) { // nếu number là snt thì in ra
                System.out.println(number + ";");
                count ++; // snt đc đếm lên 0 +1 = 1 và tiếp tục ...
            }
            number++; // tiếp tục cho number tăng lên.. tiếp tục đến count
        }
    }
}