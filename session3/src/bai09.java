import java.util.Scanner;
public class bai09 {
    /*
    Viết chương trình nhập số nguyên h và in ra màn hình tam giác vuông cân đặc có độ cao h. Ví dụ với h = 4:
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số nguyên h ");
        int h = scanner.nextInt();

        for (int i =1; i <=h; i++){
            for (int j =1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        }
}
