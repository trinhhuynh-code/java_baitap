import java.util.Scanner;

public class bai13 {
    /*
    Nhập vào 2 số tự nhiên m và n, sao cho m < n.
    Hãy liệt kê các số chính phương trong đoạn [m, n] (nhớ lại kiến thức đoạn số học trong toán).
    Có bao nhiêu số chính phương?
     */
    public static boolean checkPerfectSquare(int num) {
        if (num < 0) return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt*sqrt == num;
    }
    public static int lietke(int m, int n){
        int count = 0;
        System.out.print("Các số chính phương trong đoan [" + m + "," + n + "] là : ");
        for ( int i = m; i < n; i ++){
            if (checkPerfectSquare(i)){
                count ++;
                System.out.print(i+ " ");
            }
        }
        return count;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số m : ");
        int m = scanner.nextInt();
        System.out.print("Nhập vào số n : ");
        int n = scanner.nextInt();
        int max_n = Math.max(m , n);
        int min_m = Math.min(m , n);

        int count = lietke(min_m,max_n);
        if (count == 0){
            System.out.print("\nKhông có số chính phương nào ");
        }else {
            System.out.print("\nCó < " + count + " > số chính phương");
        }
    }

}
