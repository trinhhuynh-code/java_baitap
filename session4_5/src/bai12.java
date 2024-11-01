import java.util.Scanner;

public class bai12 {
    /*
    Viết chương trình tính tích 2 ma trận các số nguyên A cấp m x n và B cấp n x k.
     */
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số hàng của ma trận A/ row : ");
        int rowA = scanner.nextInt();
        System.out.print("Nhập vào số cột của ma trận A, hàng của ma trân B/ colArowB : ");
        int colArowB = scanner.nextInt();
        System.out.print("Nhập vào số cột của ma trận B/ col : ");
        int colB = scanner.nextInt();

        int[][] A = new int[rowA][colArowB];
        int[][] B = new int[colArowB][colB];

        //Nhập vào phần tử của ma trận A
        System.out.println("Nhập vào phần tử của ma trận A ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colArowB; j++) {
                System.out.print("A [" + i + "][" + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        //in ma trận A
        System.out.println("=> ma trận A : ");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colArowB; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

        //Nhập vào phần tử của ma trận B
        System.out.println("Nhập vào phần tử của ma trận B ");
        for (int i = 0; i < colArowB; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print("B[" + i + "][" + j + "]: ");
                B[i][j] = scanner.nextInt();
            }
        }

        //in ma trận B
        System.out.println("=> ma trận B : ");
        for (int i = 0; i < colArowB; i++) {
            for (int j = 0; j < colB; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        //tích của 2 ma trận A và B, công thức:h A[n][m] x B[p][q] => C[n][q]
        int[][] AB = new int[rowA][colB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colArowB; j++) {
                for (int l = 0; l < colB; l++) {
                    AB[i][l] += A[i][j] * B[j][l];
                }
            }
        }
        //in ma trận AB
        System.out.println("=> ma trận A*B : ");
        for (int i = 0; i < rowA; i++) {
            for (int l = 0; l < colB; l++) {
                System.out.print(AB[i][l] + " ");
            }
            System.out.println();
        }
    }
}

