import java.util.Scanner;

public class bai16 {
    /*
    Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.
     */

    // tìm số chẳn nhỏ hơn n
    public static void EvenNumLessthanN (int num1){
        System.out.print("Số chẳn nhỏ " + num1 + " là : ");
        for (int i = 0; i < num1; i ++){
            if ( i % 2 == 0) System.out.print(i + " ");
        }
    }

    // tìm số lẻ nhỏ hơn n
    public static void OddnNumLessthanN (int num2){
        System.out.print("\nSố lẻ nhỏ " + num2 + " là : ");
        for (int i = 0; i < num2; i ++){
            if ( i % 2 == 1) System.out.print(i + " ");
        }
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n : ");
        int n = scanner.nextInt();

        EvenNumLessthanN (n);
        OddnNumLessthanN (n);
    }
}
