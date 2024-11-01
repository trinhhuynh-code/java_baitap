import java.util.Scanner;

public class bai10 {
    /*
    Nhập một dãy số có n phần tử trong đó không cho phép nhập các số trùng nhau.
    Nếu nhập một số đã có thì yêu cầu nhập lại. Sau khi đủ n phần tử thì in dãy số đã nhập ra màn hình.
     */

    public static boolean Duplicate (int arr[], int num){
        for (int i = 0; i < arr.length; i++ ){
            if ( arr[i]== num) return true; //nếu nhập phần từ trùng nhau
        }
        return false;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n : ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + " : ");
            int num = scanner.nextInt();

            while (Duplicate (arr, num)){ //yêu cầu nhập lại đến khi số đó không trùng thì thôi, dùng ìf thì chỉ thông báo mà ko bắt nhập lại.
                System.out.print("Số đã tồn tại. Vui lòng nhập lại : ");
                num = scanner.nextInt();
            }
            arr[i] = num;
        }
        System.out.print("Dãy số đã nhập: ");
        for (int i = 0; i < n; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
