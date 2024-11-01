import java.util.Scanner;

public class bai11 {
    /*
    Nhập số tự nhiên n rồi tính các tổng sau:
• S = tổng các số tự nhiên không lớn hơn n.
• S1 = tổng các số tự nhiên lẻ không lớn hơn n.
• S2 = tổng các số tự nhiên chẵn không lớn hơn n.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số tự nhiên n : ");
        int n = scanner.nextInt();

        int S = 0;
        int S1 = 0;
        int S2 = 0;

        for (int i = 0; i <= n; i ++){
            S += i;
            if (i % 2 == 1){
                S1 += i;
            } else {
                S2 += i;
            }
        }
        System.out.println(" tổng các số tự nhiên không lớn hơn n S = " + S);
        System.out.println(" tổng các số tự nhiên lẻ không lớn hơn n S1 = " + S1);
        System.out.println(" tổng các số tự nhiên chẳn không lớn hơn n S2 = " + S2);

    }
}
