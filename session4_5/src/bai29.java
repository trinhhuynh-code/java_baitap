import java.util.Scanner;

public class bai29 {
    /*
    Thực hiện nhập vào một ma trận số nguyên a có n dòng và m cột (n, m > 0).
    Tính tổng, trung bình cộng của tất cả các giá trị trong ma trận.
     */
    public static double average (int [][]arr, int row, int col){
        double average = 0;
        int  sum = 0;
        for ( int i = 0; i < row; i++){
            for (int j = 0; j < col ; j++){
                sum  += arr[i][j];
                average = sum/(row*col);
            }
        }
        return average;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của ma trận row : ");
        int row = scanner.nextInt();
        System.out.print("Nhập vào số cột của ma trận col : ");
        int col = scanner.nextInt();
        int [][] arr = new int[row][col];

        //Nhập vào phần tử của ma trận
        System.out.println("Nhập vào phần tử của ma trận ");
        for ( int i = 0; i < row; i++){
            for (int j = 0; j < col ; j++){
                System.out.print("arr ["  + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        //in ma trận
        System.out.println("< ma trận >");
        for ( int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //trung bình cộng của tất cả các giá trị trong ma trận.
        double average = average (arr, row, col);
        System.out.print("Trung bình cộng của tất cả các giá trị trong ma trận là: " +average);
    }
}
