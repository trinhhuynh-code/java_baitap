public class bai18 {
    /*
    Viết chương trình liệt kê các số nguyên có từ 5 đến 7 chữ số thoả mãn tất cả các điều kiện sau:
    a) Là số nguyên tố.
    b) Là số thuận nghịch.
    c) Không chứa chữ số 4
     */
    // kiểm tra số nguyên tố
    public static boolean checkPrime (int num){
        if (num < 2) return false;
        for (int i = 2; i < num; i ++){
            if (num % i == 0) return false;
        }
        return true;
    }

    // kiểm tra thuận nghịch
    public static boolean checkPalindrome(int num) {
        int reversed = 0;
        int ori = num;
        while (num > 0){
            int degit = num % 10;
            reversed = reversed*10 + degit;
            num /= 10;
        }
        return reversed == ori;
    }

    // không chứa 4
    public static boolean notContainFour(int num) {
        while (num > 0) {
            if (num % 10 == 4) return false;
            num /= 10;
        }
        return true;
    }

    public static void main (String[] args) {
        System.out.println("Các số nguyên có từ 5 đến 7 thoả điều kiện là: ");
        for (int i = 10000; i <= 9999999; i ++){
            if (checkPrime (i) && checkPalindrome(i) && notContainFour(i)){
                System.out.println(i);
            }
        }

    }
}
