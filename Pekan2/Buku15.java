package Pekan2;

public class Buku15 {
    
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku15() {

    }

    public Buku15(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: " + harga);
    }
    
    void terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
       } else {
        System.out.println("Stok kurang!");
       }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        int hrgTotal = harga * stok;

        return hrgTotal;
    }

    int hitungDiskon(int hrgTotal) {
        if (hrgTotal > 150000) {
            hrgTotal *= 0.12;
        } else if (hrgTotal > 75000 && hrgTotal < 150000) {
            hrgTotal *= 0.05;
        }

        return hrgTotal;
    }

    void hitungHargaBayar(int hrgBayar) {
        int hrgTotal = hrgBayar;
        int diskon = hitungDiskon(hrgTotal);
        hrgTotal -= diskon;
    }
}
