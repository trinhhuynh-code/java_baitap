import java.util.Scanner;

public class bai13 {
    /*
    Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.

     */
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập số tự nhiên n :");
        int n = scanner.nextInt();

        int sum = 0;
        int count = 0;
        System.out.print(" các số tự nhiên không lớn hơn " + n + " và chia hết cho 7 : ");
        for ( int i = 1; i <= n ; i ++){
            if (i % 7 == 0){
                sum += i;
                count ++;
                System.out.print( i+ " ");
            }
        }
        System.out.print("\n Có " + count + " Số không lớn hơn " + n + " và chia hết cho 7 \n Tổng là : " + sum);
    }
}
