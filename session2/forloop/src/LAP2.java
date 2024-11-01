// Tính tổng các số chia hết cho 5 từ 0-100

public class LAP2 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if ( i % 5 ==0) {
                System.out.print ( " ; " + i);

                sum += i;
            }
        }
        System.out.println( " / tổng là : " + sum);
    }
}