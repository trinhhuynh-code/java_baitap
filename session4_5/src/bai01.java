public class bai01 {
    /*Bài 1: Viết chương trình liệt kê các số nguyên có 7 đến 9 chữ số thoả mãn cả 3 điều kiện sau:
a) Là số thuận nghịch.
b) Chỉ có chữ số 0, 6, 8
c) Tổng chữ số chia hết cho 10
     */
    public static boolean checkThuanNghich (int num1){
        int oriNum = num1;
        int reversedNum = 0;
        while (num1 != 0){
            int digit = num1 % 10;
            reversedNum = reversedNum*10 + digit;
            num1 /= 10;
        }
        return oriNum == reversedNum;
    }
    public static boolean check068 (int num2) {
        while (num2 != 0){
            int degit = num2 % 10;
            if (degit != 0 && degit != 6 && degit != 8) return false;
            num2 /= 10;
        }
        return true;
    }

    public static boolean checkSum(int num3){
        int sum = 0;
        while (num3 != 0){
            int degit = num3 % 10;
            sum += degit;
            num3 /= 10;
        }
        return sum % 10==0;
    }

    public static void main (String [] args) {
        for (int i = 1000000; i <= 999999999; i ++){
            if (checkThuanNghich (i) && check068 (i) && checkSum(i)){
                System.out.println(i);
            }
        }
    }
}
