import java.util.Scanner;

public class bai15 {
    /*
    Viết chương trình nhập số nguyên n và kiểm tra n có phải số nguyên tố hay không.
     */
    public static boolean checkPrime(int num){
        if (num < 2) return false;
        for (int i = 2;  i <= num -1 ; i ++){
            if ( num % i == 0) return false;
        }
        return true;

    }

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập số nguyên n: ");
        int n = scanner.nextInt();

        if (checkPrime(n))System.out.println( " => " + n + " Là số nguyên tố");
        else System.out.println( " => " + n + " Không là số nguyên tố");
        }
    }

