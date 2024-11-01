public class bai19 {
    /*
    Viết chương trình liệt kê các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 (ví dụ số: 721127).
     */
    public static boolean checkPalindrome (int num){
        int reserved = 0;
        int ori = num;
        while (num > 0){
            int degit = num % 10;
            reserved = reserved * 10 + degit;
            num /= 10;
        }
        return ori == reserved;
    }

    public static int Sum (int num){
        int sum = 0;
        while (num > 0){
            int degit = num % 10;
            sum += degit;
            num /= 10;
        }
        return sum;
    }
    public static void main (String[] args) {
        System.out.println("Các số thuận nghịch có 6 chữ số mà tổng chữ số chia hết cho 10 là: ");
        for (int i = 100000; i <= 999999; i++) {
            if (checkPalindrome (i) && Sum (i) % 10 == 0){
                System.out.println(i);
            }
        }
    }
}
