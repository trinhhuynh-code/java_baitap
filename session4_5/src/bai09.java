import java.util.Scanner;

public class bai09 {
    /*
    Viết chương trình tạo ngẫu nhiên mảng a gồm N phần tử bao gồm các số nguyên.
    In ra các số khác nhau trong dãy.
     */

    public static int[] uniqueArr(int[] arr) {
        // isExist[i] = true nếu arr[i] đã xuất hiện trong mảng arr[0..i-1] else -  false
        boolean isExis [] = new boolean[arr.length];// kiểm tra phần tử trong mảng đã xuất hiện hay chưa
        for (int i = 0; i < arr.length; i ++){
            isExis [i] = false; // đánh dấu các phần tử ban đầu chưa có phần tử nào trùng lặp
            for (int j = 0; j < i; j ++){ // cho j chạy duyệt qua từng phần tử của i
                if ( arr[i] == arr[j]){
                    isExis [i] = true; // có phần tử trùng lặp
                    break;// khi đã tìm đc phần tử trùng lặp thì thoát ra, ko cần chạy tiếp, đã kiểm tra đc nó ko phải là duy nhất
                }
            }
        }
        // Đếm số lượng phần tử khác nhau trong mảng
        int count = 0;
        for (int i = 0; i < arr.length; i ++){
            if (!isExis [i]) count ++;
        }

        // Khai báo mảng để lưu các phần tử khác nhau
        int uniqueArr [] = new int[count];

        // Lưu các phần tử khác nhau vào mảng uniqueArr
        int index = 0;
        for ( int i = 0; i < arr.length; i++){
            if (!isExis[i]){
                uniqueArr [index++] = arr[i];
            }
        }
        return uniqueArr;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n : ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào phần tử thứ " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        int uniqueArr [] = uniqueArr(arr);
        System.out.println("Các phần tử khác nhau trong mảng: ");
        for (int i = 0; i < uniqueArr.length; i++) {
            System.out.print(uniqueArr[i] + " ");
            }
    }
}
