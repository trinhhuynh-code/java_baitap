import java.util.Arrays;
import java.util.Scanner;

public class bai05 {
    /*
    Bài 5: Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1].
    Tìm số lớn thứ hai và vị trí của nó trong dãy.
    Chú ý trường hợp cả dãy bằng nhau thì sẽ không có số lớn thứ 2.
     */

    public static int findsecondLargest(int arr []){
        // tìm giá trị lớn / nhỏ nhất
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i ++){
            if (arr[i] > max ) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        // tìm vị trí lớn nhất trong dãy mà < max
        int index = -1;
        int secondmax = min;
        for (int i = 0; i < arr.length ; i ++){
            if(arr[i] < max && arr[i] > secondmax){
                secondmax = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n; i ++){
            System.out.print("Nhập vào phần tử thứ " + i + ": ");
            arr [i] = scanner.nextInt();
        }
        System.out.println(" Dãy a[] ban đầu : " + Arrays.toString(arr));
        int index = findsecondLargest(arr);
        if (index == -1) {
            System.out.println("Không có số lớn thứ 2 trong dãy số trên.");
        } else {
            System.out.println("Số lớn thứ 2 trong dãy số trên là: " + arr[index] + " và vị trí của nó là: " + index);
        }
    }
}
