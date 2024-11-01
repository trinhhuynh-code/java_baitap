import java.util.Scanner;

public class bai28 {
    /*
    Thực hiện nhập vào ma trận vuông số nguyên a có n dòng và n cột (n > 0).
    Tính tổng đường chéo chính của ma trận này.
     */
    public static int sumDiagonal (int [][] arr){
        int sumDiagonal = 0;
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr.length; j ++){
                if ( i == j){
                    sumDiagonal += arr[i][i];
                }
            }
        }
        return sumDiagonal;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng, số cột của ma trận n: ");
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        //nhập phần tử cho ma trận
        System.out.println("Nhập vào phần tử của ma trận ");
        for (int i = 0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                System.out.print(" arr ["+i+"]["+j+"] = ");
                arr[i][j] = scanner.nextInt();
            }
        }
        //in ma trận
        System.out.println("< ma trận >");
        for(int i=0; i < n; i ++){
            for (int j = 0; j < n; j ++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int sumDiagonal = sumDiagonal (arr);
        System.out.println("Tổng đường chéo chính của ma trận là: " + sumDiagonal);
    }
}
