import java.util.Scanner;

public class bai21 {
    /*
    Nhập mảng số nguyên a với N phần tử, thực hiện chèn số nguyên x vào vị trí k mong muốn.
    Với x và k là 2 số nguyên được nhập từ bàn phím.
     */
    public static int[] insertElement ( int arr1[], int x, int k) {
        int n = arr1.length;
        int[] arr2 = new int[n + 1];

        for (int i = 0; i < k; i++) {
            arr2[i] = arr1[i];
        }
        arr2[k] = x;
        for (int i = k + 1; i < n + 1; i++) {
            arr2[i] = arr1[i-1];
        }
        return arr2;
    }

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        //in mảng ban đầu ra
        System.out.print("Mảng arr ban đầu là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n\nNhập vào số nguyên x: ");
        int x = scanner.nextInt();
        System.out.print("Nhập vào vị trí k: ");
        int k = scanner.nextInt();

        int [] arr2 = insertElement (arr,x,k);
        System.out.print("Mảng arr sau khi chèn " + x + " vào vị trí " + k + " là: ");
        for (int i = 0; i < arr2.length; i ++){
            System.out.print(arr2[i]+ " ");
        }
    }
}
