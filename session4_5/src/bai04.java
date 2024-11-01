import java.util.Arrays;
import java.util.Scanner;

public class bai04 {
    /*
    Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1].
    Đếm xem có bao nhiêu cặp 2 phần tử liên tiếp bằng nhau trong dãy trên
    (tức là đếm số cặp a[i] , a[i+1] sao cho a[i] = a[i+1];
    nếu có trường hợp a[i] = a[i+1] = a[i+2] thì được xem là có 2 cặp).
     */
    public static int sosanh (int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập số phần tử thứ " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print(" dãy số sau khi nhập là : ");
        for ( int i = 0; i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }
        int count = sosanh (arr);
        System.out.println(" \n => số cặp 2 phần tử liên tiếp bằng nhau trong dãy: " + count);
    }
}
