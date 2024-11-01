// viết function truyền vào 1 số. kiểm tra số đó là chẳn hay lẻ
import java.util.Scanner;

public class LAP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nhập vào 1 số cần kiểm tra
        System.out.print(" nhập vào 1 số : ");
        int i = scanner.nextInt();

        if (i % 2 == 0){
            System.out.println(" số chẳn");
        } else {
            System.out.println("số lẻ");
        }
    }
}
