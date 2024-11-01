import java.util.Scanner;

public class bai25 {
    /*
    Thực hiện nhập vào một mảng số nguyên a có n phần tử (n > 0).
    Đếm xem trong mảng có bao nhiêu số lẻ và bao nhiêu số chẵn.
     */
    public static int evenNumberArray (int arr []){
        int count = 0;
        System.out.print("\nCác số chẳn là: ");
        for (int i = 0; i < arr.length; i ++){
            if (i % 2 ==0){
                count ++;
                System.out.print(arr[i] + " ");
            }
        }
        return count;
    }
    public static int oddNumberArray (int arr []){
        int count = 0;
        System.out.print("\n\nCác số lẻ là: ");
        for (int i = 0; i < arr.length; i ++){
            if (i % 2 == 1){
                count ++;
                System.out.print(arr[i] + " ");
            }
        }
        return count;
    }

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử n: ");
        int n = scanner.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i < n; i ++){
            System.out.print("Phần tử thứ " + i + " là: ");
            arr [i] = scanner.nextInt();
        }
        // in ra mảng ban đầu
        System.out.print("Mảng ban đầu là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        int count_even = evenNumberArray (arr);
            System.out.print("\n=>Tổng số chẳn là: " + count_even);

        int count_odd = oddNumberArray (arr);
        System.out.print("\n=>Tổng số lẻ là: " + count_odd);
    }
}
