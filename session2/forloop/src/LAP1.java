// viết truyền vào 1 chuỗi bất kỳ, và 1 số nguyên dương n >1,
// hãy viết hàm có tác dụng sao chép chuỗi lên n lần, ngăn cách nhau bởi dấu gạch ngang

import java.util.Scanner;

public class LAP1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        String chuoi = scanner.nextLine();

        System.out.print("Nhập vào một số: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print(" - " + chuoi);
        }
    }
}
