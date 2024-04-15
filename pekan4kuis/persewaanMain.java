package pekan4kuis;

import java.util.Scanner;

public class persewaanMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stop;

        System.out.println("=================================");
        System.out.println("Persewaan Handy Talkie Om Ica");
        System.out.println("=================================\n");

        do {
            System.out.println("=================================");
            System.out.print("Merk(Motorola/Baofeng/Icom)\t: ");
            String m = sc.next();
            System.out.print("Jumlah\t\t\t\t: ");
            int j = sc.nextInt();
            System.out.print("Lama sewa(Hari)\t\t\t: ");
            int h = sc.nextInt();

            handyTalkie ht = new handyTalkie(m, j, h);

            System.out.println("\n=================================\n");
            ht.hitungHarga();
            ht.hargaDiskon();
            ht.hargatotal();
            ht.tampilInformasi();
            
            System.out.println("\n=================================");
            System.out.print("Apakah anda ingin menambah pesanan(y/t)? ");
            stop = sc.next();
            System.out.println("=================================\n");
        } while (!stop.equals("t"));
        sc.close();

    }
}
