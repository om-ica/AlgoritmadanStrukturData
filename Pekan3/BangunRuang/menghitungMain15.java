package Pekan3.BangunRuang;

import java.util.Scanner;

public class menghitungMain15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilihan bangun\t\t: 1. Kerucut, 2. Limas, 3. Bola");
        System.out.print("Pilih bangun(1/2/3)\t: ");
        int pilihan = sc.nextInt();
        System.out.print("Berapa kali menghitung\t: ");
        int jml = sc.nextInt();
        int[] jumlah = new int[jml];

        System.out.println("\n==============================");

        switch (pilihan) {
            case 1:
                for (int i = 0; i < jumlah.length; i++) {
                    System.out.print("\nJari-jari\t\t: ");
                    double r = sc.nextDouble();
                    System.out.print("Sisi miring\t\t: ");
                    double sm = sc.nextDouble();

                    kerucut15 kc = new kerucut15(r, sm);

                    //tampil hasil
                    System.out.println("Luas Permukaan\t\t: " + kc.hitungLuasPermukaanKerucut());
                    System.out.println("Volume\t\t\t: " + kc.hitungVolumeKerucut());
                }
                break;
            case 2:
                for (int i = 0; i < jumlah.length; i++) {
                    System.out.print("\nPanjang sisi alas\t: ");
                    double psa = sc.nextDouble();
                    System.out.print("Tinggi limas\t\t: ");
                    double tl = sc.nextDouble();
                    sc.nextLine();

                    limas15 lms = new limas15(psa, tl);

                    //tampil hasil
                    System.out.println("Luas Permukaan\t\t: " + lms.hitungLuasPermukaanLimas());
                    System.out.println("Volume\t\t\t: " + lms.hitungVolumeLimas());
                }

                break;

            case 3:
                for (int i = 0; i < jumlah.length; i++) {
                    System.out.print("\nJari-jari\t\t: ");
                    double r = sc.nextDouble();

                    bola15 bl = new bola15(r);

                    //tampil hasil
                    System.out.println("Luas Permukaan\t\t: " +bl.hitungLuasPermukaanBola());
                    System.out.println("Volume\t\t\t: " + bl.hitungVolumeBola());
                }

                break;
        
            default:
            sc.close();
                break;
        }

    }
}
