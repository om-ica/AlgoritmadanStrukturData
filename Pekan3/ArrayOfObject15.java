package Pekan3;

import java.util.Scanner;

public class ArrayOfObject15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah: ");
        int jml = sc.nextInt();
        PersegiPanjang15[] ppArray = new PersegiPanjang15[jml];


        for (int i = 0; i < ppArray.length; i++) {
            ppArray[i] = new PersegiPanjang15();
            System.out.println("\nPersegi panjang ke-" + (i+1));
            System.out.print("Masukkan panjang\t: ");
            ppArray[i].panjang = sc.nextInt();
            System.out.print("Masukkan lebar\t\t: ");
            ppArray[i].lebar = sc.nextInt();
        }
        sc.close();

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("\nPersegi panjang ke-" + (i+1) );
            System.out.println("Panjang\t: " + ppArray[i].panjang + "\n Lebar\t: " + ppArray[i].lebar);
        }
    }
}