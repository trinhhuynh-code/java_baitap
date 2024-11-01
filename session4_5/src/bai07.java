import java.util.Scanner;

public class bai07 {
    /*
    Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
    Kiểm tra xem a có phải là mảng đối xứng hay không (ví dụ: [15 2 1 2 15] là mảng đối xứng).
     */
    public static boolean SymmetricArry ( int arr[]){
        for (int i = 0 ; i < arr.length; i ++){
            if ( arr[i] != arr[arr.length - i - 1])return false;
        }
        return true;
    }
    public static void main (String [] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào số phần tử thứ " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        if ( SymmetricArry (arr)){
            System.out.print("Là mảng đối xứng");
        }else {
            System.out.print("Không là mảng đối xứng");
        }
    }
}
