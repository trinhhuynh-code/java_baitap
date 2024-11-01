import java.util.Scanner;
import java.util.Arrays;

public class bai03 {
    /*
    Nhập số n và dãy các số nguyên a[0], a[1],..., a[n-1] rồi sắp xếp dãy trên theo thứ tự tăng dần.
     */
    public static void sortArray (int arr []){
        for (int i = 0; i < arr.length; i ++){
             for (int j = i+1 ; j < arr.length; j ++){
                 if (arr[i] > arr[j]){
                     int max = arr [i];
                     arr [i] = arr [j];
                     arr [j] = max;
                 }
             }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n: ");
        int n = scanner.nextInt();
        int arr [] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào các phần tử " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        sortArray(arr);
        System.out.print(" dãy số say khi sắp xếp là : ");
        for (int i = 0;  i < n ; i ++){
            System.out.print(arr[i] + " ");
        }

    }
}
