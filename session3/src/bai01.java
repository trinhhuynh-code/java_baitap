import java.util.Scanner;

public class bai01 {
    /*Viết chương trình nhập vào 4 số nguyên a, b, c và d.
    In ra màn hình kết quả xem số nào lớn nhất trong 4 số vừa nhập.
     */


    public static int findMax(int a, int b, int c, int d){
        int max = a;
        if (max < b) max = b;
        if (max < c) max = c;
        if (max < d) max = d;

        return max;
    }

    public static int findMaxArr(int [] arr){
        int max = arr[0];
        //do while
        int i = 1;
        do{
            if (max < arr[i]) max = arr[i];
            i++;
        }
        while(i < arr.length);

        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" nhập vào số nguyên a : ");
        int a = scanner.nextInt();

        System.out.print(" nhập vào số nguyên b : ");
        int b = scanner.nextInt();

        System.out.print(" nhập vào số nguyên c : ");
        int c = scanner.nextInt();

        System.out.print(" nhập vào số nguyên d : ");
        int d = scanner.nextInt();

        int max = findMax(a,b,c,d);
        System.out.print(" Số lớn nhất là : " + max);

    }
}
