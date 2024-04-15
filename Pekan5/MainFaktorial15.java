package Pekan5;

import java.util.Scanner;

public class MainFaktorial15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================");
        System.out.print("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial15[] fk = new Faktorial15[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial15();
            System.out.print("Masukkan nilai data ke-" + (i+1) + ": ");
            fk[i].nilai = sc.nextInt();
        }
        sc.close();

        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println
            ("Hasil perhitungan menggunakan Brute Force adalah "+
            fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println
            ("Hasil perhitungan menggunakan Divide Conquer adalah "+
            fk[i].faktorialDC(fk[i].nilai));
        }
    }
}
