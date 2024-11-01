import java.util.Scanner;

public class bai15 {
    //Nhập số tự nhiên n rồi tính tổng các số tự nhiên không lớn hơn n và chia hết cho 7.
    public static int sumDivisibleBy7 (int num){
        int sum = 0;
        System.out.println("Các số tự nhiên không lớn hơn " + num + " và chia hết cho 7 là: ");
        for ( int i = 0; i <= num; i ++){
            if (i % 7==0){
                sum += i;
                System.out.print(i + " ");
            }
        }
        return sum;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n : ");
        int n = scanner.nextInt();

        int sum = sumDivisibleBy7(n);
        System.out.println("\n => Tổng là: " + sum);
    }
}
