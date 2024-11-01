import java.util.Scanner;

public class bai02 {
    //Nhập số tự nhiên n rồi liệt kê các ước số của nó. Có bao nhiêu ước số?

    public static int Uoc(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(" " + i + ";");
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" nhập vào số tự nhiên n : ");
        int n = scanner.nextInt();

        int count = Uoc(n);
        System.out.println(" Là ước số của " + n + " \n Có tổng số ước là : " + count);
    }
}
