import java.util.Scanner;

public class bai14 {
    /*
    Nhập số tự nhiên n rồi in ra các số chẵn nhỏ hơn n và các số lẻ nhỏ hơn n.
     */
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhập số tự nhiên n: ");
        int n = scanner.nextInt();


        System.out.println(" số chẵn nhỏ hơn " + n +":");
        for (int i =0; i < n; i++ ){
            if ( i % 2 ==0 ){
                System.out.print(i +" ");
            }
        }
        System.out.println(" \n số lẻ nhỏ hơn " + n +":");
        for (int i =0; i < n; i++ ) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}


