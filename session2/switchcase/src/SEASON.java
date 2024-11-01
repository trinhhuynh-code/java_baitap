//nhập vào tháng 1-12, in ra các mùa tương ứng
import java.util.Scanner;

public class SEASON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào tháng : ");
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println(" mùa xuân ");
                break;
            case 2:
                System.out.println(" mùa xuân ");
                break;
            case 3:
                System.out.println(" mùa xuân ");
                break;
            case 4:
                System.out.println(" mùa hạ ");
                break;
            case 5:
                System.out.println(" mùa hạ ");
                break;
            case 6:
                System.out.println(" mùa hạ ");
                break;
            case 7:
                System.out.println(" mùa thu ");
                break;
            case 8:
                System.out.println(" mùa thu ");
                break;
            case 9:
                System.out.println(" mùa thu ");
                break;
            case 10:
                System.out.println(" mùa đông ");
                break;
            case 11:
                System.out.println(" mùa đông ");
                break;
            case 12:
                System.out.println(" mùa đông ");
                break;

            default:
                System.out.println(" không có mùa tương ứng");
        }

    }
}
