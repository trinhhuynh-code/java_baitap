import java.util.Scanner;

public class bai14 {
   // Nhập số tự nhiên n rồi tính tổng
   public static double sum (int num){
       double sum = 0;
       for ( int i = 1; i <= num; i ++){
           sum = sum + 1.0/i;
       }
       return sum;
   }
   public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Nhập vào số n : ");
       int n = scanner.nextInt();

       double tinh_sum = sum (n);
       String congthuc = "";
       System.out.println("ta được bài toán sau : ");
       System.out.print("S = ");
       for ( int i = 1; i <= n; i ++){
           if ( i < n) congthuc = "1/" + i + " + ";
           if (i == n ) congthuc = "1/" + i ;
           System.out.printf(congthuc);
       }
       System.out.printf("\n=> S = %.3f ", tinh_sum);
   }
}
