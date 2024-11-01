public class bai02 {
    /*Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn cả 3 điều kiện sau:
a) Là số nguyên tố.
b) Tất cả các chữ số là nguyên tố
c) Đảo của nó cũng là một số nguyên tố
     */
    public static boolean checkPrime(int num1) {
        if (num1 <=1 ) return false;
        for (int i = 2; i <= Math.sqrt(num1); i++) {
            if (num1 % i == 0) return false;
        }
        return true;
    }

    public static boolean checkDegitIsPrime(int num2) {
        while (num2 != 0){
            int degit = num2 % 10;
            if (!checkPrime(degit) ) return false;
            num2 /= 10;
        }
        return true;
    }

    public static boolean checkReversedIsPrime(int num3){
        int reversedNum = 0;
        while (num3 != 0) {
            int degit = num3 % 10;
            reversedNum = reversedNum * 10 + degit;
            num3 /= 10;
        }
        return checkPrime(reversedNum);
    }

    public static void main (String [] args) {
        for (int i = 1000000; i <= 9999999; i++) {
            if (checkPrime(i) && checkDegitIsPrime(i) && checkReversedIsPrime(i)) {
                System.out.println(i);
            }
        }
    }
}

