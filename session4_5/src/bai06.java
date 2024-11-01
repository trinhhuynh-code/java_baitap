import java.util.Scanner;
public class bai06 {
    /*
    Nhập số liệu cho dãy số nguyên a[0], a[1],..., a[n-1] và 2 số nguyên b, c ( với b < c).
    Tính trung bình cộng các phần tử của dãy nằm trong khoảng [b, c]
    (nhớ lại kiến thức khoảng số [b, c]: số x thuộc khoảng số [b, c] có nghĩa là b <= x <= c).
     */
    public static double tinhSum (int arr[], int b,  int c){
        int sum = 0;// Tổng các phần tử trong khoảng [b, c]
        int count = 0; // Số lượng phần tử trong khoảng [b, c]
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] >= b && arr[i] <= c){
                sum += arr[i];
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có phần tử nào trong khoảng [" + b + ", " + c + "]");
        }
        return sum / count;
    }

    public static void main (String [] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số n: ");
        int n = scanner.nextInt();
        int arr [] = new int[n];
        for (int i = 0; i < n ; i ++){
            System.out.print("Nhập vào số phần tử thứ " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Nhập vào số b: ");
        int b = scanner.nextInt();
        System.out.print("Nhập vào số c: ");
        int c = scanner.nextInt();

        double average = tinhSum(arr, b ,c );
        System.out.print("trung bình cộng các phần tử trong mảng [ " + b + " , " + c + " ] là : " + average);
    }
}
