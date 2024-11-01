// nhập vào 2 số nguyên, tính tổng các số nguyên nằm giữa chúng

import java.util.Scanner;

public class LAP3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên thứ  1: ");
        int num1 = scanner.nextInt();

        System.out.print("Nhập vào một số nguyên thứ  2: ");
        int num2 = scanner.nextInt();

        int sum = 0;

        int nummin = Math.min(num1, num2);
        int nummax = Math.max(num1, num2);

        for (int i = nummin + 1; i < nummax; i++) {
            sum += i ;
        }
        System.out.println( " tổng là : " + sum);
    }
}