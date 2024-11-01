import java.util.Scanner;

public class bai26 {
    /*
    Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một số nguyên x.
    Đếm số lần xuất hiện của x trong mảng a.
     */
    public static int countAppear (int arr[], int x){
        int count = 0;
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] == x){
                count ++;
            }
        }
        return count;
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + i + " là: ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập vào số x: ");
        int x = scanner.nextInt();

        int count = countAppear (arr, x);
            System.out.print("Số lần xuất hiện của " + x + " là: " + count);

    }
}
