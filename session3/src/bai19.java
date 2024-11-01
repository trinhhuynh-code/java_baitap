import java.util.Scanner;

public class bai19 {
    /*
    Viết chương trình nhập số nguyên h và in ra màn hình tam giác cân có độ cao h. Ví dụ với h = 4:
     */
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập số nguyên h: ");
        int h = scanner.nextInt();

        for (int row = h ; row >= 1; row --) {
            for (int space = 1; space <= h - row ; space ++) {
                System.out.print("_");
            }
            for (int star = 1; star <= row*2-1 ; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


