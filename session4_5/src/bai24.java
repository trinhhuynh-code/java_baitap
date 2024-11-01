import java.util.Scanner;

public class bai24 {
    /*
    Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0).
    Thực hiện sắp xếp mảng theo thứ tự giảm dần.
     */

    public static int [] sortarray (int arr []){
        for ( int i = 0; i < arr.length; i ++){
            for (int j = i +1; j < arr.length; j ++ ){
                if (arr[i] < arr[j]){
                   int min = arr[i];
                   arr[i] = arr[j];
                   arr[j] = min;
                }
            }
        }
        return arr;
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
        // in ra mảng ban đầu
        System.out.print("Mảng ban đầu là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        //in ra mảng ban đầu sau khi sắp xếp
        sortarray(arr);
        System.out.print("\nMảng ban đầu sau khi sắp xếp giảm dần là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
