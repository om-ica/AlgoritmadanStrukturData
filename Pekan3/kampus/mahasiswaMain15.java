package Pekan3.kampus;

import java.util.Scanner;

public class mahasiswaMain15 {
    public static void main(String[] args) {
        mahasiswa15[] mhs = new mahasiswa15[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mhs.length; i++) {
                mhs[i] = new mahasiswa15();
                System.out.println("\nMasukkan data mahasiswa ke-" + (i+1));
                System.out.print("Masukkan nama\t: ");
                mhs[i].nama = sc.next();
                sc.nextLine();
                System.out.print("Masukkan NIM\t: ");
                mhs[i].nim = sc.nextInt();
                System.out.print("Jenis kelamin\t: ");
                mhs[i].kelamin = sc.next().charAt(0);
                System.out.print("Masukkan IPK\t: ");
                mhs[i].ipk = sc.nextFloat();
        }
        sc.close();

        System.out.println("\n=============================");

        for (int i = 0; i < mhs.length; i++) {
            mhs[i].tampilInformasi();
        }

        System.out.println("\n=============================");

        //tampil rerata ipk
        float rerata = mahasiswa15.hitungRerata(mhs);
        System.out.println("\nRata-rata\t: " + rerata);

        System.out.println("\n=============================");

        mahasiswa15 mhsTerbaik = mahasiswa15.mhsIpkTertinggi(mhs);
        System.out.println("Mahasiswa dengan Nilai IPK Tertinggi.");
        mhsTerbaik.tampilInformasi();
    }
}
