package Pekan3.Array;

import java.util.Scanner;

public class ym {
    public static int f(int n) {
        if (n <=1) {
            return n;
        } else {
            int kiri = f(n-1);
            int kanan = f(n-2);
            return kiri+kanan;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N: ");
        int n = sc.nextInt();
        sc.close();

        int hasil = f(n);
        System.out.println(hasil);
    }
}
