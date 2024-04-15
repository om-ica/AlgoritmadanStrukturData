package Pekan8;

import java.util.Scanner;

public class Utama15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Percobaan 1 Menyimpan Tumpukan dalam Gudang!");
        System.out.print("Kapasitas gudang: ");
        int kapasitas = scanner.nextInt();
        Gudang15 gudang = new Gudang15(kapasitas);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampil barang teratas");
            System.out.println("5. Tampilakan barang terbawah");
            System.out.println("6. Cari barang");
            System.out.println("7. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nama kategori: ");
                    String kategori = scanner.nextLine();
                    Barang15 barangBaru = new Barang15(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.tampilTop();
                    break;
                case 5:
                    gudang.tampilTerbawah();
                    break;
                case 6:
                    System.out.print("Cari barang berdasarkan kode/nama? ");
                    String cari = scanner.nextLine();

                    if (cari.equalsIgnoreCase("Kode")) {
                        System.out.print("Masukkan kode: ");
                        int angka = scanner.nextInt();
                        scanner.nextLine();
                        gudang.cariKode(angka);
                    } if (cari.equalsIgnoreCase("Nama")) {
                        System.out.print("Masukkan nama: ");
                        String huruf = scanner.nextLine();
                        gudang.cariNama(huruf);
                    }
                    break;
                case 7:
                    System.exit(pilihan);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
        }
    }
}
