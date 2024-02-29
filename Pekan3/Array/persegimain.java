package Pekan3.Array;

import java.util.Scanner;

public class persegimain {
    public static void main(String[] args) {
        persegi[] pgArray = new persegi[100];

        Scanner sc = new Scanner(System.in);

        pgArray[5] = new persegi();
        pgArray[0] = new persegi();
        System.out.print("Masukkan sisi: ");
        pgArray[5].sisi = sc.nextInt();
        sc.close();
    }
}
