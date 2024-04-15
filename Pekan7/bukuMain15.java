package Pekan7;

import java.util.Scanner;

public class bukuMain15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int posisi;

        pencarianBuku15 data = new pencarianBuku15();
        int jumlahBuku = 5;

        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan data Buku secara terurut dari data kodeBuku terkecil!");
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("---------------------");
            System.out.print("Kode Buku\t: ");
            String kodeBuku = s1.nextLine();
            System.out.print("Judul Buku\t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit\t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang\t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock\t\t: ");
            int stock = s.nextInt();

            buku15 m = new buku15(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Data keseluruhan Buku: ");
        data.tampil();

        System.out.println("----------------------------------------------------");
        System.out.println("Data setelah di sorting");
        data.sorting();
        data.tampil();

        System.out.println("----------------------------------------------------");
        System.out.println("Pencarian Data: ");
        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan kode Buku yang dicari!");
        System.out.print("Kode Buku: ");
        String cari = s1.nextLine();
        System.out.println("Menggunakan Sequential Search");
        posisi = data.findSeqSearch(cari);
        data.tampilPosisi(cari, posisi);
        System.out.println("----------------------------------------------------");
        data.tampilData(cari, posisi);

        buku15 dataBuku = data.findBuku(cari);
        if (dataBuku != null) {
            System.out.println("Data ditemukan!");
            dataBuku.tampilDataBuku();
        } else {
            System.out.println("Data tidak ditemukan");
        }

        System.out.println("===============================");
        System.out.println("Menggunakan binary search!");
        posisi = data.findBinarySearch(cari, 0, jumlahBuku-1);
        data.tampilPosisi(cari, posisi);
        data.tampilData(cari, posisi);

        System.out.println("----------------------------------------------------");
        System.out.println("Masukkan Judul Buku yang dicari!");
        System.out.print("Judul Buku: ");
        String cariJudul = s1.nextLine();
        System.out.println("Menggunakan Sequential Search");
        posisi = data.seqSearchJudBuk(cariJudul);
        data.tampilPosisi(cariJudul, posisi);
        System.out.println("----------------------------------------------------");
        data.tampilData(cariJudul, posisi);

        System.out.println("===============================");
        System.out.println("Menggunakan binary search!");
        posisi = data.BinarySearchJudBuk(cariJudul, 0, jumlahBuku-1);
        data.tampilPosisi(cariJudul, posisi);
        data.tampilData(cariJudul, posisi);



        s.close();
        s1.close();
    }
}
