import java.util.Scanner;

public class bai05 {
    /*
    Một số được gọi là số thuận nghịch nếu ta đọc từ trái sang phải hay từ phải sang trái số đó
    ta vẫn nhận được một số giống nhau. Hãy nhập một số và kiểm tra xem số đó có phải
     số thuật nghịch hay không (ví dụ số: 558855 hoặc 123321 hoặc 12321).
     */
    public static boolean isThuanNghich(int number) {
        // công thức đảo ngược:

        int ori = number;
        int reversedNumber = 0;// khởi tạo giá trị ban đầu:  công thức:
        while (ori > 0) {
            //number % 10 , chia lấy dư. lấy ra chữ số cuối cùng
            // number /10 chia lấy thương, bỏ chữ số cuối cùng
            // lấy số cuối (1)-tạo ra số đầu-loại bỏ số cuối (1) --tiếp tục vòng > lấy số cuối (2)...
            int digit = ori % 10;
            reversedNumber = reversedNumber * 10 + digit;
            ori /= 10;
        }
        return reversedNumber == number;//Kiểm tra/so sánh số nghịch đảo có bằng số ban đầu không
    }
// C2 chữ
    public static boolean isPalindrome(String number) {
        int number_length = number.length();
        for (int i = 0; i < number_length; i++) {
            if (number.charAt(i) != number.charAt(number_length - i - 1)) {
            return false;
        }
    }
        return true;
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập n : ");
        int n = scanner.nextInt();

        if (isThuanNghich(n)) System.out.println( n + " là số thuận nghịch");
        else System.out.println( n + " không phải là số thuận nghịch");

        // c2 chuyển số sang string
        String n_str = String.valueOf(n);

        if (isPalindrome(n_str)) System.out.println( n + " là số thuận nghịch");
        else System.out.println( n + " không phải là số thuận nghịch");

    }
}
