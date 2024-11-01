import java.util.Scanner;

public class bai08 {
    /*
    Nhập mảng a gồm N phần tử bao gồm các số nguyên dương.
    In phần tử có số lần xuất hiện nhiều nhất trong a.
     */
    public static int findmaxnumelement ( int arr []){
        int element = arr [0];
        int maxcount = 1;
        for (int i = 0; i < arr.length ; i ++){
            int count = 0;
            for ( int j = 0; j < arr.length; j ++){
                if ( arr[i] == arr[j]) count ++;
            }
            if (count > maxcount){
                maxcount = count;
                element = arr[i];
            }
        }
        System.out.println("Số lần Phần tử xuất hiện nhiều nhất trong mảng là: " + maxcount );
        return element;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0 ; i < n ; i ++){
            System.out.print("Nhập vào phần tử thứ " + i + " : ");
            arr [i] = scanner.nextInt();
        }
        int element = findmaxnumelement(arr);
        System.out.println("Phần tử xuất hiện nhiều nhất trong mảng là: " + element );
    }
}
