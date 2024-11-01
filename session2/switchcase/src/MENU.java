//nhập vào giá tiền, chọn sản phẩm phù hợp vơi giá tiền
import java.util.Scanner;

public class MENU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào giá tiền: ");
        int x = scanner.nextInt();

        switch (x) {
            case 12000:
                System.out.println(" cà phê sữa ");
                break;
            case 10000:
                System.out.println(" cà phê đá ");
                break;
            case 8000:
                System.out.println(" sting dâu ");
                break;
            case 2000:
                System.out.println(" trà đá ");
                break;

            default:
                System.out.println(" không có sản phẩm hợp với giá tiền");
        }

    }
}
