// viết function truyền vào 2 số a và b. In ra màng hình số có giá trị lớn hơn
import java.util.Scanner;

public class LAP1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Nhập vào số thứ nhất
        System.out.print("số thứ nhất: ");
        int i1 = scanner.nextInt();

// Nhập vào số thứ hai
        System.out.print("số thứ hai: ");
        int i2 = scanner.nextInt();

        if (i1 > i2 ) {
            System.out.println(" số lớn nhất là : " + i1);
        } else if (i2 > i1) {
            System.out.println(" số lớn nhất là :" + i2);
        }
    }
}
