import java.util.Scanner;

public class bai27 {
    /*
    Thực hiện nhập vào hai mảng số nguyên a, b đều có n phần tử (n > 0).
    Thực hiện tính tổng hai mảng này theo quy tắc:
    - phần tử đầu của a sẽ được cộng với phần tử cuối của b để cho ra phần tử đầu của mảng kết quả,
    - tiếp theo phần tử thứ 2 của a và phần tử gần cuối của b được cộng vào để cho ra phần tử thứ 2
     của mảng kết quả, …
     */
    public static int [] sumArrAvsB (int arrA[], int arrB[], int n){
        int [] arrResult = new int[n];
        for ( int i = 0; i < n; i ++){
            arrResult [i] = arrA[i] + arrB[n - i -1];
        }
         return arrResult;
    }
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử n: ");
        int n = scanner.nextInt();

        //Nhập vào phần tử cho mảng b
        int[] arrA = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + i + " của mảng a là: ");
            arrA[i] = scanner.nextInt();
        }

        //Nhập vào phần tử cho mảng b
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Phần tử thứ " + i + " của mảng b là: ");
            arrB[i] = scanner.nextInt();
        }
        // in ra mảng a
        System.out.print("Mảng a là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrA[i] + " ");
        }
        // in ra mảng b
        System.out.print("\nmảng b là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrB[i] + " ");
        }

        // in ra mảng kết quả của a + b
        int [] arrResult =sumArrAvsB (arrA, arrB, n);
        System.out.print("\n=>Mảng kết quả của array a và b là: ");
        for (int i = 0; i < n; i ++){
            System.out.print(arrResult[i] + " ");
        }

    }
}
