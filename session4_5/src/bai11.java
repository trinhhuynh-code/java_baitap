import java.util.Scanner;

public class bai11 {
    /*
    Viết chương trình nhập số liệu cho ma trận các số nguyên A cấp m x n trong đó m, n là các số tự nhiên.
    Sau đó tìm ma trận chuyển vị B = (b[i][j]) cấp n x m của A, với b[i][j] = a[j][i]
     */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của ma trận A/ row : ");
        int row = scanner.nextInt();
        System.out.print("Nhập vào số cột của ma trận A/ col : ");
        int col = scanner.nextInt();

        int [][] A = new int[row][col]; //mảng 2 chiểu với m là hàng,  n là cột
        int [][] B = new int[col][row]; //mảng 2 chiểu với n là hàng,  m là cột

        //Nhập vào phần tử của ma trận A
        System.out.println("Nhập vào phần tử của ma trận A ");
        for ( int i = 0; i < row; i++){
            for (int j = 0; j < col ; j++){
                System.out.print("A ["  + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        //in ma trận A
        System.out.println("ma trận A : ");
        for ( int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        //tìm ma trận chuyển vị B
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                B[i][j] = A[j][i];
            }
        }
        //in ma trận chuyển vị B
        System.out.println("ma trận chuyển vị B : ");
        for ( int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }
}
