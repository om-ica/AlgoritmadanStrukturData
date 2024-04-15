package Pekan6.latihan;

public class hotel15 {
    String nama, kota;
    int harga;
    Byte bintang;

    hotel15(String n, String k, int h, Byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    void tampil() {
        System.out.println("Nama Hotel\t: "+nama);
        System.out.println("Kota\t\t: "+kota);
        System.out.println("Harga\t\t: "+harga);
        System.out.println("Bintang\t\t: "+bintang);

    }
}
