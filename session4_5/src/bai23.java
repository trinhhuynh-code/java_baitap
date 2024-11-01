import java.util.Scanner;

public class bai23 {
    /*
    Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0) và một giá trị thực x.
    Thực hiện sắp xếp mảng a theo thứ tự tăng dần và chèn giá trị x vào trong mảng a
    sao cho vẫn giữ được tính sắp xếp của mảng.
     */
    //sắp xếp mảng
    public static int [] sortarray (int [] arr){
        for (int i = 0; i < arr.length; i ++){
            for (int j = i +1; j < arr.length; j ++){
                if ( arr[i] > arr[j]){
                    int max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;
                }
            }
        }
        return arr;
    }
    //chèn giá trị x vào trong mảng
    public static int [] insertNum (int [] arr, int x){
        // Tìm vị trí chèn giá trị x vào mảng a
        // điều kiện
        int n = arr.length;
        int index = 0;
        while (index < n && arr[index] < x){
            index ++;
        }

        //sao chép các phần tử ban đầu từ vị trí 0 đến vị trí phần tử x
        int [] arr2 = new int[n + 1];
        for (int i = 0; i < index; i ++){
            arr2[i] = arr[i];
        }

        arr2[index] = x; // gán phần tử x vào vị trí index

        // chép các phần tử còn lại vào mảng 2
        for (int i = index +1; i < n + 1; i ++ ){
            arr2[i] = arr[i-1];
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
        // in ra mảng ban đầu
        System.out.print("Mảng ban đầu là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        //in ra mảng ban đầu sau khi sắp xếp
        sortarray (arr);
        System.out.print("\nMảng ban đầu sau khi sắp xếp là: ");
        for (int i = 0;  i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }

        //nhập x
        System.out.print("\n\nNhập vào số thực x: ");
        int x = scanner.nextInt();

        //mảng đã chèn x, và sắp xếp
        sortarray (arr);
        int [] arr2 = insertNum (arr,x);
        System.out.print("Mảng sau khi chèn " + x + " và sắp xếp tăng dần là: ");
        for (int i = 0; i < arr2.length; i ++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
