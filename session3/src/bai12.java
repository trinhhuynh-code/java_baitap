import java.util.Scanner;

public class bai12 {
    /*
    Nhập vào 2 số tự nhiên m và n, sao cho m < n.
    Hãy liệt kê các số chính phương trong đoạn [m,n].
    Có bao nhiêu số chính phương? (Nhớ lại kiến thức về đoạn số được học ở lớp 10,
    một số x thuộc đoạn [m, n] có nghĩa là m <= x <= n)
     */

    public static boolean checkPerfectSquare(int num) {
        if (num < 0) {
            return false; // Số âm không thể là số chính phương
        }
        // Tính căn bậc hai của số và kiểm tra
        int sqrt = (int) Math.sqrt(num); //Tính căn bậc hai và ép kiểu về số nguyên.
        return sqrt * sqrt == num;
    }

    public static int lietke(int m, int n) {
        int count = 0;
        for (int i = m; i <= n; i++) {
            if (checkPerfectSquare(i)) {
                System.out.print(i + "; ");
                count++;
            }
        }
    return count;
}

    public static void main (String [] args) {
        //Số chính phương là số có căn bậc hai của nó cũng là một số nguyên,
        //    ví dụ: 4 có căn bậc hai là 2, 9 có căn bậc hai là 3,...

        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập số tự nhiên m (m<n) :");
        int m = scanner.nextInt();
        System.out.print(" nhập số tự nhiên n (m<n):");
        int n = scanner.nextInt();

        int count = lietke(m, n);
        System.out.println(" Là " + count + " số chính phương ");

            }
        }



