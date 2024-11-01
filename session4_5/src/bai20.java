import java.util.Scanner;

public class bai20 {
    /*
    Thực hiện nhập vào một mảng số nguyên a có n phần tử (n>0).
    Tìm số lớn nhất và nhỏ nhất trong mảng a.
    (Làm bằng 2 cách: cách sử dụng sắp xếp (2 vòng for) và cách không sử dụng sắp xếp (1 vòng for))
     */
    //cách 1 cách không sử dụng sắp xếp (1 vòng for)
    public static void findMaxMin_C1 (int arr []){
        System.out.println("----------CÁCH 1---------");
        int Max = arr[0];
        int Min = arr[0];
        for ( int i = 0; i < arr.length; i++){
            if (arr[i] > Max) Max = arr [i];
            if (arr[i] < Min) Min = arr [i];
        }
        System.out.println("Phần tử lớn nhất trong mảng: " + Max);
        System.out.println("Phần tử nhỏ nhất trong mảng: " + Min);
    }


    //cách 2  cách sử dụng sắp xếp (2 vòng for)
    public static int [] findMaxMin_C2 (int arr []){
        System.out.println("\n----------CÁCH 2---------");
        for (int i = 0; i < arr.length; i ++){
            for(int j = i+1; j < arr.length; j ++){
                if (arr[i] > arr[j]){
                    int Max = arr [i];
                    arr[i] = arr[j];
                    arr[j] = Max;
                }
            }
        }
        return arr;
    }

    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào n: ");
        int n = scanner.nextInt();

        int arr [] = new int[n];
        for ( int i = 0; i < n; i ++){
            System.out.print("Nhập vào phần tử thứ " + i + " : ");
            arr[i] = scanner.nextInt();
        }
        findMaxMin_C1 (arr);

        findMaxMin_C2 (arr);
        System.out.println("Dãy số say khi sắp xếp là : ");
        for (int i = 0;  i < n ; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nPhần tử lớn nhất trong mảng: " + arr[n-1]);
        System.out.println("Phần tử nhỏ nhất trong mảng: " + arr[0]);
    }
}
